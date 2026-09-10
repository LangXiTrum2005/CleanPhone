package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class he extends c8 {
    public MetaData m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f41053n;
    public final /* synthetic */ AdPreferences o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ie f41054p;

    /* JADX WARN: Illegal instructions before constructor call */
    public he(ie ieVar, Context context, lb lbVar, AdPreferences adPreferences, Context context2, AdPreferences adPreferences2) {
        MetaDataRequest$RequestReason metaDataRequest$RequestReason = MetaDataRequest$RequestReason.PERIODIC;
        this.f41054p = ieVar;
        this.f41053n = context2;
        this.o = adPreferences2;
        super(context, lbVar, adPreferences, metaDataRequest$RequestReason, null, 0);
    }

    @Override // com.startapp.sdk.internal.c8
    public final Boolean a() {
        try {
            com.startapp.sdk.adsbase.g.e(this.f41053n);
            mc mcVar = new mc(this.f41053n, (vf) com.startapp.sdk.components.a.a(this.f41053n).G.a(), MetaDataRequest$RequestReason.PERIODIC);
            mcVar.a(this.f41053n, this.o);
            String strA = a(this.f41053n, mcVar);
            if (!TextUtils.isEmpty(strA)) {
                MetaData metaData = (MetaData) JsonParser.fromJson(strA, MetaData.class);
                this.m = metaData;
                return Boolean.valueOf(metaData != null);
            }
        } catch (Throwable th) {
            g9.a(th);
        }
        return Boolean.FALSE;
    }

    @Override // com.startapp.sdk.internal.c8
    /* JADX INFO: renamed from: c */
    public final void b(Boolean bool) {
        MetaData metaData;
        WeakHashMap weakHashMap = vi.f41589a;
        try {
            if (bool.booleanValue() && (metaData = this.m) != null) {
                MetaData.a(this.f41053n, metaData, MetaDataRequest$RequestReason.PERIODIC, this.f40861l);
            }
            this.f41054p.callback.a();
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
