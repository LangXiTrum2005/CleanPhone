package com.unity3d.services.core.configuration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum ErrorState {
    CreateWebApp("create_webapp"),
    NetworkConfigRequest("network_config"),
    NetworkWebviewRequest("network_webview"),
    InvalidHash("invalid_hash"),
    CreateWebview("create_webview"),
    MalformedWebviewRequest("malformed_webview"),
    ResetWebApp("reset_webapp"),
    LoadCache("load_cache"),
    InitModules("init_modules"),
    CreateWebviewTimeout("create_webview_timeout"),
    CreateWebviewGameIdDisabled("create_webview_game_id_disabled"),
    CreateWebviewConfigError("create_webview_config_error"),
    CreateWebviewInvalidArgument("create_webview_invalid_arg"),
    InvalidGameId("check_gameId");

    private String _stateMetricName;

    ErrorState(String str) {
        this._stateMetricName = str;
    }

    public String getMetricName() {
        return this._stateMetricName;
    }
}
