package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3554hg {

    /* JADX INFO: renamed from: com.ironsource.hg$a */
    public static final class a extends AbstractC3554hg {
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.a;
        }

        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.a + ")";
        }

        public final a a(LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new a(adFormat);
        }

        public static /* synthetic */ a a(a aVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.a;
            }
            return aVar.a(adFormat);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.hg$b */
    public static final class b extends AbstractC3554hg {
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.a;
        }

        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "MissingPlacements(adFormat=" + this.a + ")";
        }

        public final b a(LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new b(adFormat);
        }

        public static /* synthetic */ b a(b bVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.a;
            }
            return bVar.a(adFormat);
        }
    }

    public /* synthetic */ AbstractC3554hg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3554hg() {
    }
}
