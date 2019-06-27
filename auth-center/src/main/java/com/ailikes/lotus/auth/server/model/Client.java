package com.ailikes.lotus.auth.server.model;
import java.io.Serializable;

public class Client implements Serializable{
	/**
    *
    */
   private static final long serialVersionUID = -8185413579135897885L;
   private Long id;
   private String clientId;
   private String resourceIds = "";
   private String clientSecret;
   private String clientSecretStr;
   private String scope = "all";
   private String authorizedGrantTypes = "authorization_code,password,refresh_token,client_credentials";
   private String webServerRedirectUri;
   private String authorities = "";
   private Integer accessTokenValidity = 18000;
   private Integer refreshTokenValidity = 18000;
   private String additionalInformation = "{}";
   private String autoapprove = "true";

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getClientId() {
      return clientId;
   }

   public void setClientId(String clientId) {
      this.clientId = clientId;
   }

   public String getResourceIds() {
      return resourceIds;
   }

   public void setResourceIds(String resourceIds) {
      this.resourceIds = resourceIds;
   }

   public String getClientSecret() {
      return clientSecret;
   }

   public void setClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
   }

   public String getClientSecretStr() {
      return clientSecretStr;
   }

   public void setClientSecretStr(String clientSecretStr) {
      this.clientSecretStr = clientSecretStr;
   }

   public String getScope() {
      return scope;
   }

   public void setScope(String scope) {
      this.scope = scope;
   }

   public String getAuthorizedGrantTypes() {
      return authorizedGrantTypes;
   }

   public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
      this.authorizedGrantTypes = authorizedGrantTypes;
   }

   public String getWebServerRedirectUri() {
      return webServerRedirectUri;
   }

   public void setWebServerRedirectUri(String webServerRedirectUri) {
      this.webServerRedirectUri = webServerRedirectUri;
   }

   public String getAuthorities() {
      return authorities;
   }

   public void setAuthorities(String authorities) {
      this.authorities = authorities;
   }

   public Integer getAccessTokenValidity() {
      return accessTokenValidity;
   }

   public void setAccessTokenValidity(Integer accessTokenValidity) {
      this.accessTokenValidity = accessTokenValidity;
   }

   public Integer getRefreshTokenValidity() {
      return refreshTokenValidity;
   }

   public void setRefreshTokenValidity(Integer refreshTokenValidity) {
      this.refreshTokenValidity = refreshTokenValidity;
   }

   public String getAdditionalInformation() {
      return additionalInformation;
   }

   public void setAdditionalInformation(String additionalInformation) {
      this.additionalInformation = additionalInformation;
   }

   public String getAutoapprove() {
      return autoapprove;
   }

   public void setAutoapprove(String autoapprove) {
      this.autoapprove = autoapprove;
   }
}
