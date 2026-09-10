package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20903b;

    public AutoValue_LibraryVersion(String str, String str2) {
        this.f20902a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f20903b = str2;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public final String a() {
        return this.f20902a;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public final String b() {
        return this.f20903b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        return this.f20902a.equals(libraryVersion.a()) && this.f20903b.equals(libraryVersion.b());
    }

    public final int hashCode() {
        return ((this.f20902a.hashCode() ^ 1000003) * 1000003) ^ this.f20903b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f20902a);
        sb.append(", version=");
        return android.support.v4.media.a.r(sb, this.f20903b, "}");
    }
}
