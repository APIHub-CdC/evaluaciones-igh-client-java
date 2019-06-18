package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.Consulta;
import io.apihub.client.model.Errores;
import io.apihub.client.model.Respuesta;
import io.apihub.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;


public class EvaluacionesIGHApiTest {

    private final EvaluacionesIGHApi api = new EvaluacionesIGHApi();
    private ApiClient apiClient = new ApiClient();
    
    @Before()
    public void setUp() {

        this.apiClient = api.getApiClient();
        
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void EvaluacionesIGHTest() {
        String xApiKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        String cveUsuario = "XXXXXXXX";
        String cveEmpresa = "XXXXXXXX";
        String password = "XXXXXXXX";
        Consulta body = new Consulta();
        body.setFechaInicial("XXXX-XX-XX");
        body.setFechaFinal("XXXX-XX-XX");
        body.setCorreoElectronico("XXXXXXXXXXXXXXXXXXXXXXXX");
        body.setFolioEmpresa(null);
        
        Respuesta response;
        try {
            response = api.getEvaluacionesIGH(cveUsuario, cveEmpresa, xApiKey, password, body);
            System.out.println(response.toString());
        } catch (ApiException e) {
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
    
}
