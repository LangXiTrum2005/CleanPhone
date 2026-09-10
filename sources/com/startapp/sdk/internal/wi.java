package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.vast.VASTResource$CreativeType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class wi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.startapp.sdk.ads.video.vast.b f41641c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f41642e;
    public final ArrayList f;

    public wi(int i2, int i3, com.startapp.sdk.ads.video.vast.b bVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f41639a = i2;
        this.f41640b = i3;
        this.f41641c = bVar;
        this.d = str;
        this.f41642e = arrayList;
        this.f = arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    public final float a(int i2, int i3) {
        int i4;
        float f = 0.0f;
        if (i3 == 0 || (i4 = this.f41640b) == 0) {
            return 0.0f;
        }
        float f2 = i2;
        float fAbs = Math.abs((f2 - this.f41639a) / f2) + Math.abs((f2 / i3) - (this.f41639a / i4));
        int iOrdinal = this.f41641c.f40570b.ordinal();
        if (iOrdinal == 0) {
            VASTResource$CreativeType vASTResource$CreativeType = this.f41641c.f40571c;
            if (vASTResource$CreativeType != null) {
                int iOrdinal2 = vASTResource$CreativeType.ordinal();
                if (iOrdinal2 == 1) {
                    f = 0.8f;
                } else if (iOrdinal2 == 2) {
                    f = 1.0f;
                }
            }
        } else if (iOrdinal == 1) {
            f = 1.2f;
        } else if (iOrdinal == 2) {
            f = 1.0f;
        }
        return f / (fAbs + 1.0f);
    }
}
