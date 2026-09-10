package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.j;
import kotlin.jvm.internal.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38426c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AdSize banner() {
            return new AdSize(320, 50, j.f29553a, null);
        }

        public final AdSize large() {
            return new AdSize(320, 90, j.f29554b, null);
        }

        public final AdSize leaderboard() {
            return new AdSize(728, 90, j.f29556d, null);
        }

        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, j.f29559g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i10, int i11, String str, g gVar) {
        this(i10, i11, str);
    }

    public static final AdSize banner() {
        return Companion.banner();
    }

    public static final AdSize large() {
        return Companion.large();
    }

    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f38425b;
    }

    public final String getSizeDescription() {
        return this.f38426c;
    }

    public final int getWidth() {
        return this.f38424a;
    }

    private AdSize(int i10, int i11, String str) {
        this.f38424a = i10;
        this.f38425b = i11;
        this.f38426c = str;
    }
}
