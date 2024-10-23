package com.travelwink.opensearch_demo.opensearch.config;

import org.apache.hc.client5.http.auth.AuthScope;
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.apache.hc.client5.http.impl.auth.BasicCredentialsProvider;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.ClientTlsStrategyBuilder;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.transport.httpclient5.ApacheHttpClient5Transport;
import org.opensearch.client.transport.httpclient5.ApacheHttpClient5TransportBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Configuration
public class CustomOpensearchClient {
//
//    @Bean
//    public OpenSearchClient opensearchClient() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
//        String hostname = "vpc-itp-uat-xxx.eu-central-1.es.amazonaws.com";
//        int port = 443;
//        String user = "xxx";
//        String pass = "xxx";
//
//        HttpHost[] hosts = new HttpHost[] { new HttpHost( "https", hostname, port) };
//
//        SSLContext sslContext = SSLContextBuilder.create().loadTrustMaterial(null, (chains, authType) -> true).build();
//
//        ApacheHttpClient5Transport transport = ApacheHttpClient5TransportBuilder.builder(hosts)
//            .setMapper(new JacksonJsonpMapper())
//            .setHttpClientConfigCallback(httpClientBuilder -> {
//                final var credentialsProvider = new BasicCredentialsProvider();
//                for (final var host : hosts) {
//                    credentialsProvider.setCredentials(new AuthScope(host), new UsernamePasswordCredentials(user, pass.toCharArray()));
//                }
//
//                // Disable SSL/TLS verification as our local testing clusters use self-signed certificates
//                final var tlsStrategy = ClientTlsStrategyBuilder.create()
//                        .setSslContext(sslContext)
//                        .setHostnameVerifier(NoopHostnameVerifier.INSTANCE)
//                        .build();
//
//                final var connectionManager = PoolingAsyncClientConnectionManagerBuilder.create().setTlsStrategy(tlsStrategy).build();
//
//                return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider).setConnectionManager(connectionManager);
//            })
//            .build();
//        return new OpenSearchClient(transport);
//    }
}
