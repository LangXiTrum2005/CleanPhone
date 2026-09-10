package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Ag {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends Ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LevelPlay.AdFormat f25654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LevelPlay.AdFormat adFormat) {
            super(null);
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f25654a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.f25654a;
        }

        public final LevelPlay.AdFormat b() {
            return this.f25654a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f25654a == ((a) obj).f25654a;
        }

        public int hashCode() {
            return this.f25654a.hashCode();
        }

        public String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.f25654a + ")";
        }

        public final a a(LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            return new a(adFormat);
        }

        public static /* synthetic */ a a(a aVar, LevelPlay.AdFormat adFormat, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adFormat = aVar.f25654a;
            }
            return aVar.a(adFormat);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends Ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LevelPlay.AdFormat f25655a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LevelPlay.AdFormat adFormat) {
            super(null);
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f25655a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.f25655a;
        }

        public final LevelPlay.AdFormat b() {
            return this.f25655a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f25655a == ((b) obj).f25655a;
        }

        public int hashCode() {
            return this.f25655a.hashCode();
        }

        public String toString() {
            return "MissingPlacements(adFormat=" + this.f25655a + ")";
        }

        public final b a(LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            return new b(adFormat);
        }

        public static /* synthetic */ b a(b bVar, LevelPlay.AdFormat adFormat, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adFormat = bVar.f25655a;
            }
            return bVar.a(adFormat);
        }
    }

    public /* synthetic */ Ag(kotlin.jvm.internal.g gVar) {
        this();
    }

    private Ag() {
    }
}
