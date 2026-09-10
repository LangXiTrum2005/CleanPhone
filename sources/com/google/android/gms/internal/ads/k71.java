package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k71 extends qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o71 f16359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l71 f16360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(l71 l71Var, o71 o71Var) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f16360b = l71Var;
        this.f16359a = o71Var;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        ln0 ln0Var;
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) rh.b(parcel, Bundle.CREATOR);
        rh.f(parcel);
        int i11 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i12 = bundle.getInt("uiMode", 0);
        byte b10 = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b11 = (byte) (b10 | 2);
        Boolean boolValueOf = bundle.containsKey("userInteracted") ? Boolean.valueOf(bundle.getBoolean("userInteracted")) : null;
        if (b11 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b11 & 1) == 0) {
                sb2.append(" statusCode");
            }
            if ((b11 & 2) == 0) {
                sb2.append(" uiMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        this.f16359a.zza(new i71(i11, string, i12, boolValueOf));
        if (i11 == 8157 && (ln0Var = this.f16360b.f16776a) != null) {
            l71.f16774c.b("unbind LMD display overlay service", new Object[0]);
            ln0Var.j(new ry0(ln0Var, 11));
        }
        return true;
    }
}
