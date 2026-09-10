package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC0344g;
import com.ironsource.InterfaceC0362h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface k {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0344g {
        @Override // com.ironsource.InterfaceC0344g
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0362h {
        @Override // com.ironsource.InterfaceC0362h
        public Intent a(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements InterfaceC0362h {
        @Override // com.ironsource.InterfaceC0362h
        public Intent a(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
