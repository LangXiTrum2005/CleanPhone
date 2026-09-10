package com.google.zxing.datamatrix.decoder;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class Version {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21357a;

    public static final class ECB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21358a;

        public ECB(int i2, int i3) {
            this.f21358a = i2;
        }
    }

    static {
        new Version(1, new ECBlocks(5, new ECB(1, 3)));
        new Version(2, new ECBlocks(7, new ECB(1, 5)));
        new Version(3, new ECBlocks(10, new ECB(1, 8)));
        new Version(4, new ECBlocks(12, new ECB(1, 12)));
        new Version(5, new ECBlocks(14, new ECB(1, 18)));
        new Version(6, new ECBlocks(18, new ECB(1, 22)));
        new Version(7, new ECBlocks(20, new ECB(1, 30)));
        new Version(8, new ECBlocks(24, new ECB(1, 36)));
        new Version(9, new ECBlocks(28, new ECB(1, 44)));
        new Version(10, new ECBlocks(36, new ECB(1, 62)));
        new Version(11, new ECBlocks(42, new ECB(1, 86)));
        new Version(12, new ECBlocks(48, new ECB(1, 114)));
        new Version(13, new ECBlocks(56, new ECB(1, 144)));
        new Version(14, new ECBlocks(68, new ECB(1, 174)));
        new Version(15, new ECBlocks(42, new ECB(2, 102)));
        new Version(16, new ECBlocks(56, new ECB(2, 140)));
        new Version(17, new ECBlocks(36, new ECB(4, 92)));
        new Version(18, new ECBlocks(48, new ECB(4, 114)));
        new Version(19, new ECBlocks(56, new ECB(4, 144)));
        new Version(20, new ECBlocks(68, new ECB(4, 174)));
        new Version(21, new ECBlocks(56, new ECB(6, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE)));
        new Version(22, new ECBlocks(68, new ECB(6, 175)));
        new Version(23, new ECBlocks(62, new ECB(8, 163)));
        new Version(24, new ECBlocks(new ECB(8, 156), new ECB(2, ModuleDescriptor.MODULE_VERSION)));
        new Version(25, new ECBlocks(7, new ECB(1, 5)));
        new Version(26, new ECBlocks(11, new ECB(1, 10)));
        new Version(27, new ECBlocks(14, new ECB(1, 16)));
        new Version(28, new ECBlocks(18, new ECB(1, 22)));
        new Version(29, new ECBlocks(24, new ECB(1, 32)));
        new Version(30, new ECBlocks(28, new ECB(1, 49)));
    }

    public Version(int i2, ECBlocks eCBlocks) {
        this.f21357a = i2;
        for (ECB ecb : eCBlocks.f21359a) {
            int i3 = ecb.f21358a;
        }
    }

    public final String toString() {
        return String.valueOf(this.f21357a);
    }

    public static final class ECBlocks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ECB[] f21359a;

        public ECBlocks(int i2, ECB ecb) {
            this.f21359a = new ECB[]{ecb};
        }

        public ECBlocks(ECB ecb, ECB ecb2) {
            this.f21359a = new ECB[]{ecb, ecb2};
        }
    }
}
