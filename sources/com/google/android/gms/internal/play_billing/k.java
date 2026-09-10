package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum k {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f24389c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24391a;

    static {
        b2.p pVar = new b2.p((byte) 0, 5);
        pVar.f5364c = new Object[8];
        pVar.f5363b = 0;
        for (k kVar : values()) {
            Integer numValueOf = Integer.valueOf(kVar.f24391a);
            int i10 = pVar.f5363b + 1;
            Object[] objArr = (Object[]) pVar.f5364c;
            int length = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length) {
                if (i11 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i11) {
                        int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                pVar.f5364c = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) pVar.f5364c;
            int i12 = pVar.f5363b;
            int i13 = i12 + i12;
            objArr2[i13] = numValueOf;
            objArr2[i13 + 1] = kVar;
            pVar.f5363b = i12 + 1;
        }
        s sVar = (s) pVar.f5365d;
        if (sVar != null) {
            throw sVar.a();
        }
        a0 a0VarA = a0.a(pVar.f5363b, (Object[]) pVar.f5364c, pVar);
        s sVar2 = (s) pVar.f5365d;
        if (sVar2 != null) {
            throw sVar2.a();
        }
        f24389c = a0VarA;
    }

    k(int i10) {
        this.f24391a = i10;
    }
}
