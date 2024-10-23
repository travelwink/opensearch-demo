package com.travelwink.opensearch_demo.client;

import lombok.extern.slf4j.Slf4j;
import org.apache.hc.core5.http.HttpHost;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch.core.InfoResponse;
import org.opensearch.client.transport.aws.AwsSdk2Transport;
import org.opensearch.client.transport.aws.AwsSdk2TransportOptions;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.http.SdkHttpClient;
import software.amazon.awssdk.http.apache.ApacheHttpClient;
import software.amazon.awssdk.regions.Region;

import java.io.IOException;

@Slf4j
public class AwsClient {
    public static void main(String[] args) throws IOException {
        // OpenSearch endpoint, without https://
        String host = "vpc-xxx-xxx.eu-central-1.es.amazonaws.com";
        String accessKeyId = "xxx";
        String secretAccessKey = "xxx";

        HttpHost[] hosts = new HttpHost[] { new HttpHost( "https", host, 443) };

        SdkHttpClient httpClient = ApacheHttpClient.builder()
                .tlsTrustManagersProvider(() -> null)
                .build();

        OpenSearchClient client = new OpenSearchClient(
                new AwsSdk2Transport(
                        httpClient,
                        host,
                        "es",
                        Region.EU_CENTRAL_1, // signing service region
                        AwsSdk2TransportOptions.builder()
                                .setCredentials(() -> AwsBasicCredentials.create(accessKeyId, secretAccessKey))
                                .build()
                )
        );

        InfoResponse info = client.info();
        log.info("{}: {}", info.version().distribution(), info.version().number());

        httpClient.close();
    }
}
