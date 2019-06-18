package io.apihub.client.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.ApiResponse;
import io.apihub.client.Configuration;
import io.apihub.client.Pair;
import io.apihub.client.ProgressRequestBody;
import io.apihub.client.ProgressResponseBody;

import io.apihub.client.model.Consulta;
import io.apihub.client.model.Errores;
import io.apihub.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluacionesIGHApi {
    private ApiClient apiClient;

    public EvaluacionesIGHApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EvaluacionesIGHApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public okhttp3.Call evaluacionesIGHCall(String cveUsuario, String cveEmpresa, String xApiKey, String password, Consulta body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (cveUsuario != null)
        localVarHeaderParams.put("cveUsuario", apiClient.parameterToString(cveUsuario));
        if (cveEmpresa != null)
        localVarHeaderParams.put("cveEmpresa", apiClient.parameterToString(cveEmpresa));
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private okhttp3.Call evaluacionesIGHValidateBeforeCall(String cveUsuario, String cveEmpresa, String xApiKey, String password, Consulta body) throws ApiException {
        
        if (cveUsuario == null) {
            throw new ApiException("Missing the required parameter 'cveUsuario' when calling rootPost(Async)");
        }
        
        if (cveEmpresa == null) {
            throw new ApiException("Missing the required parameter 'cveEmpresa' when calling rootPost(Async)");
        }
        
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling rootPost(Async)");
        }
        
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling rootPost(Async)");
        }
        

        okhttp3.Call call = evaluacionesIGHCall(cveUsuario, cveEmpresa, xApiKey, password, body, null, null);
        return call;

    }

    public Respuesta getEvaluacionesIGH(String cveUsuario, String cveEmpresa, String xApiKey, String password, Consulta body) throws ApiException {
        ApiResponse<Respuesta> resp = getEvaluacionesIGHWithHttpInfo(cveUsuario, cveEmpresa, xApiKey, password, body);
        return resp.getData();
    }
    public ApiResponse<Respuesta> getEvaluacionesIGHWithHttpInfo(String cveUsuario, String cveEmpresa, String xApiKey, String password, Consulta body) throws ApiException {
        okhttp3.Call call = evaluacionesIGHValidateBeforeCall(cveUsuario, cveEmpresa, xApiKey, password, body);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
