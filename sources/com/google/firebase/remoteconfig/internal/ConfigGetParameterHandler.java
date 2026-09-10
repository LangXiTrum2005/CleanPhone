package com.google.firebase.remoteconfig.internal;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigGetParameterHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20962e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20963a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConfigCacheClient f20965c;
    public final ConfigCacheClient d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f20964b = executor;
        this.f20965c = configCacheClient;
        this.d = configCacheClient2;
    }

    public static HashSet a(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer configContainerC = configCacheClient.c();
        if (configContainerC != null) {
            Iterator<String> itKeys = configContainerC.f20941b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}
