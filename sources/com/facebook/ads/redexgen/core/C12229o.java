package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.extractor.ExtractorsFactory;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12229o {
    public static byte[] A08;
    public static String[] A09 = {"634gowWrnODsCbHJW3RM2adSB8UjvpNK", "SJrAWOr70TCHX", "EwIuJu9eGNp0k", "E6EVZDT", "sHeITXs", "FXQ6HdUX", "YL7g5rxYaYN1DF5ZV43is2fGGs0zV37S", "j2oNEgxbTlE4krYsb5twTfwtoUHd8Sk9"};
    public DC A02;
    public String A05;
    public final C5Y A06;
    public final Object A07;
    public A6 A01 = A3.A01();
    public FF A03 = new C2667n9();
    public int A00 = 1048576;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1754")
    public InterfaceC2541ku<InterfaceExecutorC1354Fb> A04 = new InterfaceC2541ku() { // from class: com.facebook.ads.redexgen.X.nj
        @Override // com.facebook.ads.redexgen.core.InterfaceC2541ku
        public final Object get() {
            return C12229o.A01();
        }
    };

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A09[7].charAt(23) != 't') {
                throw new RuntimeException();
            }
            A09[4] = "2gbF6ls";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 26);
            i5++;
        }
    }

    public static void A03() {
        A08 = new byte[]{20, 35, 35, 62, 35, 113, 56, 63, 34, 37, 48, 63, 37, 56, 48, 37, 56, 63, 54, 113, 21, 52, 55, 48, 36, 61, 37, 20, 41, 37, 35, 48, 50, 37, 62, 35, 34, 23, 48, 50, 37, 62, 35, 40, 106, 102, 100, 39, 111, 104, 106, 108, 107, 102, 102, 98, 39, 104, 109, 122, 39, 104, 103, 109, 123, 102, 96, 109, 113, 39, 100, 108, 109, 96, 104, 58, 39, 108, 113, 125, 123, 104, 106, 125, 102, 123, 39, 77, 108, 111, 104, 124, 101, 125, 76, 113, 125, 123, 104, 106, 125, 102, 123, 122, 79, 104, 106, 125, 102, 123, 112};
    }

    static {
        A03();
    }

    public C12229o(C5Y c5y) {
        this.A06 = c5y;
    }

    public static /* synthetic */ C2714nu A00(HD hd, C8O c8o) {
        return new C2714nu(hd);
    }

    public static /* synthetic */ InterfaceExecutorC1354Fb A01() {
        return null;
    }

    @MetaExoPlayerCustomization("Custom reflection logic to avoid loading DefaultExtractorsFactory")
    public final C12219n A04(Uri uri) {
        String strA02 = A02(0, 44, 75);
        if (this.A02 == null) {
            try {
                Constructor<? extends ExtractorsFactory> constructor = Class.forName(A02(44, 67, 19)).asSubclass(HD.class).getConstructor(new Class[0]);
                final HD hd = (HD) constructor.newInstance(new Object[0]);
                this.A02 = new DC() { // from class: com.facebook.ads.redexgen.X.nl
                    @Override // com.facebook.ads.redexgen.core.DC
                    public final DD A5X(C8O c8o) {
                        return C12229o.A00(hd, c8o);
                    }
                };
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(strA02, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(strA02, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException(strA02, e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(strA02, e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(strA02, e6);
            }
        }
        return new C12219n(new C10562u().A00(uri).A02(this.A05).A01(this.A07).A05(), this.A06, this.A02, this.A01, this.A03, this.A00, null);
    }
}
