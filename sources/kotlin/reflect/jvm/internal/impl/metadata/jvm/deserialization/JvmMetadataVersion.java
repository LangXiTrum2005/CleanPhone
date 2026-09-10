package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmMetadataVersion extends BinaryVersion {
    public static final JvmMetadataVersion g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final JvmMetadataVersion f44154h;
    public final boolean f;

    public static final class Companion {
    }

    static {
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(new int[]{1, 8, 0}, false);
        g = jvmMetadataVersion;
        int i2 = jvmMetadataVersion.f44100c;
        int i3 = jvmMetadataVersion.f44099b;
        f44154h = (i3 == 1 && i2 == 9) ? new JvmMetadataVersion(new int[]{2, 0, 0}, false) : new JvmMetadataVersion(new int[]{i3, i2 + 1, 0}, false);
        new JvmMetadataVersion(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int[] versionArray, boolean z2) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.f(versionArray, "versionArray");
        this.f = z2;
    }

    public final boolean b(JvmMetadataVersion metadataVersionFromLanguageVersion) {
        Intrinsics.f(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        JvmMetadataVersion jvmMetadataVersion = g;
        int i2 = this.f44099b;
        int i3 = this.f44100c;
        if (i2 == 2 && i3 == 0 && jvmMetadataVersion.f44099b == 1 && jvmMetadataVersion.f44100c == 8) {
            return true;
        }
        if (!this.f) {
            jvmMetadataVersion = f44154h;
        }
        jvmMetadataVersion.getClass();
        int i4 = metadataVersionFromLanguageVersion.f44099b;
        int i5 = jvmMetadataVersion.f44099b;
        if (i5 > i4 || (i5 >= i4 && jvmMetadataVersion.f44100c > metadataVersionFromLanguageVersion.f44100c)) {
            metadataVersionFromLanguageVersion = jvmMetadataVersion;
        }
        boolean z2 = false;
        if ((i2 == 1 && i3 == 0) || i2 == 0) {
            return false;
        }
        int i6 = metadataVersionFromLanguageVersion.f44099b;
        if (i2 > i6 || (i2 >= i6 && i3 > metadataVersionFromLanguageVersion.f44100c)) {
            z2 = true;
        }
        return !z2;
    }
}
