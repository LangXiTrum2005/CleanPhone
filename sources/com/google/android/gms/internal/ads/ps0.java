package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.w f18793b;

    public /* synthetic */ ps0(b2.w wVar, int i10) {
        this.f18792a = i10;
        this.f18793b = wVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Integer a() {
        Bundle bundle = ((mx) this.f18793b.f5411c).f17566a.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i10 = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        i10 = 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        i10 = 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        i10 = 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        i10 = 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        i10 = 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        i10 = 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        i10 = 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        i10 = 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        i10 = 8;
                    }
                    break;
            }
        }
        return Integer.valueOf(i10);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f18792a) {
            case 0:
                String str = ((mx) this.f18793b.f5411c).f17569d;
                ic1.h(str);
                return str;
            case 1:
                return Integer.valueOf(this.f18793b.f5410b);
            case 2:
                return Boolean.valueOf(((mx) this.f18793b.f5411c).l);
            case 3:
                return Boolean.valueOf(((mx) this.f18793b.f5411c).f17576k);
            case 4:
                String str2 = ((mx) this.f18793b.f5411c).f17573h;
                ic1.h(str2);
                return str2;
            default:
                return a();
        }
    }
}
