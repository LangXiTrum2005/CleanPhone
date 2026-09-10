package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.annotations.ExtraProperty;

/* JADX INFO: loaded from: classes4.dex */
@ExtraProperty
public @interface Protobuf {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IntEncoding {
        public static final IntEncoding X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ IntEncoding[] f20800Y;

        static {
            IntEncoding intEncoding = new IntEncoding("DEFAULT", 0);
            X = intEncoding;
            f20800Y = new IntEncoding[]{intEncoding, new IntEncoding("SIGNED", 1), new IntEncoding("FIXED", 2)};
        }

        public static IntEncoding valueOf(String str) {
            return (IntEncoding) Enum.valueOf(IntEncoding.class, str);
        }

        public static IntEncoding[] values() {
            return (IntEncoding[]) f20800Y.clone();
        }
    }

    IntEncoding intEncoding() default IntEncoding.X;

    int tag();
}
