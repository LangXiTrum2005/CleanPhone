package org.apache.commons.codec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class CodecPolicy {
    public static final CodecPolicy X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ CodecPolicy[] f45187Y;

    /* JADX INFO: Fake field, exist only in values array */
    CodecPolicy EF0;

    static {
        CodecPolicy codecPolicy = new CodecPolicy("STRICT", 0);
        CodecPolicy codecPolicy2 = new CodecPolicy("LENIENT", 1);
        X = codecPolicy2;
        f45187Y = new CodecPolicy[]{codecPolicy, codecPolicy2};
    }

    public static CodecPolicy valueOf(String str) {
        return (CodecPolicy) Enum.valueOf(CodecPolicy.class, str);
    }

    public static CodecPolicy[] values() {
        return (CodecPolicy[]) f45187Y.clone();
    }
}
