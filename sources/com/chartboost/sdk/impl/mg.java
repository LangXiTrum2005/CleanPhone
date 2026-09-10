package com.chartboost.sdk.impl;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class mg implements z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z6 f14499a;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f14500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(1);
            this.f14500b = map;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult matchResult) {
            Intrinsics.f(matchResult, "matchResult");
            String value = matchResult.getValue();
            String str = (String) this.f14500b.get(value);
            return str != null ? str : value;
        }
    }

    public mg(z6 eventTracker) {
        Intrinsics.f(eventTracker, "eventTracker");
        this.f14499a = eventTracker;
    }

    public final String a(File htmlFile, Map allParams, String adTypeName, String location) {
        Intrinsics.f(htmlFile, "htmlFile");
        Intrinsics.f(allParams, "allParams");
        Intrinsics.f(adTypeName, "adTypeName");
        Intrinsics.f(location, "location");
        try {
            Regex regex = new Regex("\\{\\{\\s*([^}]+)\\s*\\}\\}|\\{%\\s*([^}]+)\\s*%\\}");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allParams.entrySet()) {
                String str = (String) entry.getKey();
                if (StringsKt.M(str, "{{", false) || StringsKt.M(str, "{%", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return a(regex.d(FilesKt.d(htmlFile, Charsets.f44691a), new a(linkedHashMap)));
        } catch (Exception e2) {
            za.b("Failed to parse template", e2);
            a(adTypeName, location, e2.toString());
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14499a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14499a.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14499a.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14499a.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14499a.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14499a.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14499a.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14499a.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14499a.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14499a.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14499a.mo189track(event);
    }

    public final void a(String str, String str2, String str3) {
        track((ch) h5.m.a(fh.i.HTML_MISSING_MUSTACHE_ERROR, str3, str, str2));
    }

    public final String a(String str) {
        if (StringsKt.l(str, "{{", false)) {
            throw new IllegalArgumentException("Missing required template parameter ".concat(str));
        }
        return str;
    }
}
