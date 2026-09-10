package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m2 extends ce implements zd {
    public final lb j;
    public final lb k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f4 f41238l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context, lb commonPrefs, lb prefs, lb consentManager, lb handler, f4 configProvider) {
        super(context, prefs, handler, "26787005dc4a1477", "c8ef3e50475fc527");
        Intrinsics.f(context, "context");
        Intrinsics.f(commonPrefs, "commonPrefs");
        Intrinsics.f(prefs, "prefs");
        Intrinsics.f(consentManager, "consentManager");
        Intrinsics.f(handler, "handler");
        Intrinsics.f(configProvider, "configProvider");
        this.j = commonPrefs;
        this.k = consentManager;
        this.f41238l = configProvider;
    }

    @Override // com.startapp.sdk.internal.ce
    public final Object a(String str) {
        return str;
    }

    @Override // com.startapp.sdk.internal.k6
    public final /* bridge */ /* synthetic */ Object c() {
        return "";
    }

    @Override // com.startapp.sdk.internal.ce
    public final long d() {
        this.f41238l.getClass();
        BluetoothConfig bluetoothConfigL = MetaData.E().l();
        if (bluetoothConfigL != null) {
            return bluetoothConfigL.b();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.ce
    public final boolean f() {
        Boolean boolB = ((h6) this.k.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.f41238l.getClass();
            BluetoothConfig bluetoothConfigL = MetaData.E().l();
            if (bluetoothConfigL != null && bluetoothConfigL.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ce
    public final void g() {
        Context context = this.f41177a;
        Intrinsics.e(context, "context");
        lb lbVar = this.j;
        this.f41238l.getClass();
        BluetoothConfig bluetoothConfigL = MetaData.E().l();
        long millis = TimeUnit.SECONDS.toMillis(bluetoothConfigL != null ? bluetoothConfigL.c() : 0);
        this.f41238l.getClass();
        BluetoothConfig bluetoothConfigL2 = MetaData.E().l();
        com.startapp.sdk.adsbase.periodic.a aVar = new com.startapp.sdk.adsbase.periodic.a(context, this, lbVar, millis, TimeUnit.MINUTES.toMillis(bluetoothConfigL2 != null ? bluetoothConfigL2.a() : 0));
        ((Executor) com.startapp.sdk.components.a.a(aVar.f41697a).D.a()).execute(aVar.d);
    }

    @Override // com.startapp.sdk.internal.zd
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
