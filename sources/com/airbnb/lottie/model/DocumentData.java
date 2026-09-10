package com.airbnb.lottie.model;

import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes.dex */
public class DocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9716c;
    public Justification d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9717e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9719i;
    public float j;
    public boolean k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Justification {
        public static final Justification X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ Justification[] f9720Y;

        /* JADX INFO: Fake field, exist only in values array */
        Justification EF0;

        static {
            Justification justification = new Justification("LEFT_ALIGN", 0);
            Justification justification2 = new Justification("RIGHT_ALIGN", 1);
            Justification justification3 = new Justification("CENTER", 2);
            X = justification3;
            f9720Y = new Justification[]{justification, justification2, justification3};
        }

        public static Justification valueOf(String str) {
            return (Justification) Enum.valueOf(Justification.class, str);
        }

        public static Justification[] values() {
            return (Justification[]) f9720Y.clone();
        }
    }

    public final int hashCode() {
        int iOrdinal = ((this.d.ordinal() + (((int) (a.b(this.f9715b, this.f9714a.hashCode() * 31, 31) + this.f9716c)) * 31)) * 31) + this.f9717e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f9718h;
    }
}
