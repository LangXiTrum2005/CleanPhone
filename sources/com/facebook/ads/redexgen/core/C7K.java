package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7K {
    public static byte[] A08;
    public InterfaceC1292bE A02;
    public String A05;
    public final InterfaceC1437dZ A06;
    public final Object A07;
    public TO A01 = TL.A01();
    public InterfaceC1464e1 A03 = new C0967Pq();
    public int A00 = 1048576;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1754")
    public InterfaceC1729iP<InterfaceExecutorC1579ft> A04 = new InterfaceC1729iP() { // from class: com.facebook.ads.redexgen.X.Qz
        @Override // com.facebook.ads.redexgen.core.InterfaceC1729iP
        public final Object get() {
            return C7K.A01();
        }
    };

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{110, 89, 89, 68, 89, 11, 66, 69, 88, 95, 74, 69, 95, 66, 74, 95, 66, 69, 76, 11, 111, 78, 77, 74, 94, 71, 95, 110, 83, 95, 89, 74, 72, 95, 68, 89, 88, 109, 74, 72, 95, 68, 89, 82, 77, 65, 67, 0, 73, 65, 65, 73, 66, 75, 0, 79, 64, 74, 92, 65, 71, 74, 0, 75, 86, 65, 94, 66, 79, 87, 75, 92, 28, 0, 75, 86, 90, 92, 79, 77, 90, 65, 92, 0, 106, 75, 72, 79, 91, 66, 90, 107, 86, 90, 92, 79, 77, 90, 65, 92, 93, 104, 79, 77, 90, 65, 92, 87};
    }

    public C7K(InterfaceC1437dZ interfaceC1437dZ) {
        this.A06 = interfaceC1437dZ;
    }

    public static /* synthetic */ RB A00(UO uo, RK rk) {
        return new RB(uo);
    }

    public static /* synthetic */ InterfaceExecutorC1579ft A01() {
        return null;
    }

    @MetaExoPlayerCustomization("Custom reflection logic to avoid loading DefaultExtractorsFactory")
    public final C6O A04(Uri uri) {
        String strA02 = A02(0, 44, 87);
        if (this.A02 == null) {
            try {
                Constructor<? extends ExtractorsFactory> constructor = Class.forName(A02(44, 64, 82)).asSubclass(UO.class).getConstructor(new Class[0]);
                final UO uo = (UO) constructor.newInstance(new Object[0]);
                this.A02 = new InterfaceC1292bE() { // from class: com.facebook.ads.redexgen.X.R0
                    @Override // com.facebook.ads.redexgen.core.InterfaceC1292bE
                    public final InterfaceC1293bF A5N(RK rk) {
                        return C7K.A00(uo, rk);
                    }
                };
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(strA02, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(strA02, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(strA02, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(strA02, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(strA02, e5);
            }
        }
        return new C6O(new PH().A00(uri).A02(this.A05).A01(this.A07).A05(), this.A06, this.A02, this.A01, this.A03, this.A00, null);
    }
}
