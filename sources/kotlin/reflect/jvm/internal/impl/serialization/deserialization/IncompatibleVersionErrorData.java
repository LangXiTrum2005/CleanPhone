package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.datastore.preferences.protobuf.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JvmMetadataVersion f44410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JvmMetadataVersion f44411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JvmMetadataVersion f44412c;
    public final JvmMetadataVersion d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44413e;
    public final ClassId f;

    public IncompatibleVersionErrorData(JvmMetadataVersion jvmMetadataVersion, JvmMetadataVersion jvmMetadataVersion2, JvmMetadataVersion jvmMetadataVersion3, JvmMetadataVersion jvmMetadataVersion4, String filePath, ClassId classId) {
        Intrinsics.f(filePath, "filePath");
        Intrinsics.f(classId, "classId");
        this.f44410a = jvmMetadataVersion;
        this.f44411b = jvmMetadataVersion2;
        this.f44412c = jvmMetadataVersion3;
        this.d = jvmMetadataVersion4;
        this.f44413e = filePath;
        this.f = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return this.f44410a.equals(incompatibleVersionErrorData.f44410a) && Intrinsics.a(this.f44411b, incompatibleVersionErrorData.f44411b) && Intrinsics.a(this.f44412c, incompatibleVersionErrorData.f44412c) && this.d.equals(incompatibleVersionErrorData.d) && Intrinsics.a(this.f44413e, incompatibleVersionErrorData.f44413e) && Intrinsics.a(this.f, incompatibleVersionErrorData.f);
    }

    public final int hashCode() {
        int iHashCode = this.f44410a.hashCode() * 31;
        JvmMetadataVersion jvmMetadataVersion = this.f44411b;
        int iHashCode2 = (iHashCode + (jvmMetadataVersion == null ? 0 : jvmMetadataVersion.hashCode())) * 31;
        JvmMetadataVersion jvmMetadataVersion2 = this.f44412c;
        return this.f.hashCode() + a.b(this.f44413e, (this.d.hashCode() + ((iHashCode2 + (jvmMetadataVersion2 != null ? jvmMetadataVersion2.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f44410a + ", compilerVersion=" + this.f44411b + ", languageVersion=" + this.f44412c + ", expectedVersion=" + this.d + ", filePath=" + this.f44413e + ", classId=" + this.f + ')';
    }
}
