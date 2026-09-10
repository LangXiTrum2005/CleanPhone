package com.facebook.gamingservices.cloudgaming.internal;

import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes3.dex */
public enum SDKMessageEnum {
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_PLAY_STORE("openPlayStore"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_APP_STORE("openAppStore"),
    /* JADX INFO: Fake field, exist only in values array */
    MARK_GAME_LOADED("markGameLoaded"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_PLAYER_DATA("getPlayerData"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_PLAYER_DATA("setPlayerData"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_CATALOG("getCatalog"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_PURCHASES("getPurchases"),
    /* JADX INFO: Fake field, exist only in values array */
    PURCHASE("purchase"),
    /* JADX INFO: Fake field, exist only in values array */
    CONSUME_PURCHASE("consumePurchase"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_READY("onReady"),
    /* JADX INFO: Fake field, exist only in values array */
    LOAD_INTERSTITIAL_AD("loadInterstitialAd"),
    /* JADX INFO: Fake field, exist only in values array */
    LOAD_REWARDED_VIDEO("loadRewardedVideo"),
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_INTERSTITIAL_AD("showInterstitialAd"),
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_REWARDED_VIDEO(d9.g.f24696i),
    /* JADX INFO: Fake field, exist only in values array */
    GET_ACCESS_TOKEN("getAccessToken"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_CONTEXT_TOKEN("getContextToken"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_PAYLOAD("getPayload"),
    /* JADX INFO: Fake field, exist only in values array */
    IS_ENV_READY("isEnvReady"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE(AppLovinEventTypes.USER_SHARED_LINK),
    /* JADX INFO: Fake field, exist only in values array */
    CAN_CREATE_SHORTCUT("canCreateShortcut"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_SHORTCUT("createShortcut"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_GAMING_SERVICES_DEEP_LINK("openGamingServicesDeepLink"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_GAME_REQUESTS_DIALOG("openGameRequestsDialog"),
    /* JADX INFO: Fake field, exist only in values array */
    POST_SESSION_SCORE("postSessionScore"),
    /* JADX INFO: Fake field, exist only in values array */
    POST_SESSION_SCORE_ASYNC("postSessionScoreAsync"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_TOURNAMENT_ASYNC("getTournamentAsync"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_CREATE_ASYNC("tournamentCreateAsync"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_SHARE_ASYNC("tournamentShareAsync"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_POST_SCORE_ASYNC("tournamentPostScoreAsync"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_GET_TOURNAMENTS_ASYNC("getTournaments"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT_JOIN_ASYNC("joinTournament"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_LINK("openExternalLink"),
    /* JADX INFO: Fake field, exist only in values array */
    PERFORM_HAPTIC_FEEDBACK_ASYNC("performHapticFeedbackAsync"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTEXT_SWITCH("contextSwitch"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTEXT_CHOOSE("contextChoose"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTEXT_CREATE("contextCreate"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTEXT_GET_ID("contextGetID"),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG_PRINT("debugPrint");

    public final String X;

    SDKMessageEnum(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
