package com.bytedance.sdk.component.OY;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    private static nBu Lxb = new nBu() { // from class: com.bytedance.sdk.component.OY.JXs.1
        @Override // com.bytedance.sdk.component.OY.nBu
        public QAg createThreadFactory(int i, String str) {
            return new QAg(i, str);
        }
    };

    public static void Lxb(nBu nbu) {
        Lxb = nbu;
    }

    public static nBu Lxb() {
        return Lxb;
    }
}
