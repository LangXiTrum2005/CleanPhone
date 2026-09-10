package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f36565a = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements l {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public void a(int i10, b bVar) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, List<c> list) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, List<c> list, boolean z10) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
            eVar.skip(i11);
            return true;
        }
    }

    void a(int i10, b bVar);

    boolean a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException;

    boolean a(int i10, List<c> list);

    boolean a(int i10, List<c> list, boolean z10);
}
