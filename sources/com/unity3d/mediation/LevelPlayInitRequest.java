package com.unity3d.mediation;

import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayInitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<LevelPlay.AdFormat> f38522c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f38524b;

        public Builder(String appKey) {
            n.f(appKey, "appKey");
            this.f38523a = appKey;
        }

        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.f38523a, this.f38524b, null, 4, null);
        }

        public final String getAppKey() {
            return this.f38523a;
        }

        public final Builder withUserId(String userId) {
            n.f(userId, "userId");
            this.f38524b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f38520a = str;
        this.f38521b = str2;
        this.f38522c = list;
    }

    public final String getAppKey() {
        return this.f38520a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f38522c;
    }

    public final String getUserId() {
        return this.f38521b;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i10, g gVar) {
        this(str, str2, (i10 & 4) != 0 ? v.f53866a : list);
    }
}
