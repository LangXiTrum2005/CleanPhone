package com.unity3d.ads.core.data.model;

import ak.i;
import ak.j;
import ak.k;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/model/CoroutineOpportunity;", "Lak/i;", "Lcom/google/protobuf/ByteString;", X3.i.X, "<init>", "(Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/ByteString;", "getValue", "()Lcom/google/protobuf/ByteString;", "Lak/j;", "getKey", "()Lak/j;", X3.i.W, "Key", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CoroutineOpportunity implements i {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ByteString value;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.model.CoroutineOpportunity$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/data/model/CoroutineOpportunity$Key;", "Lak/j;", "Lcom/unity3d/ads/core/data/model/CoroutineOpportunity;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion implements j {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public CoroutineOpportunity(ByteString value) {
        n.f(value, "value");
        this.value = value;
    }

    @Override // ak.k
    public <R> R fold(R r2, c cVar) {
        return (R) com.google.android.gms.internal.auth.i.p(this, r2, cVar);
    }

    @Override // ak.k
    public <E extends i> E get(j jVar) {
        return (E) com.google.android.gms.internal.auth.i.r(this, jVar);
    }

    @Override // ak.i
    public j getKey() {
        return INSTANCE;
    }

    public final ByteString getValue() {
        return this.value;
    }

    @Override // ak.k
    public k minusKey(j jVar) {
        return com.google.android.gms.internal.auth.i.z(this, jVar);
    }

    @Override // ak.k
    public k plus(k kVar) {
        return com.google.android.gms.internal.auth.i.D(this, kVar);
    }
}
