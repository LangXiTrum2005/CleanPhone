package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wd {

    public static final class a extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f15475a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable error) {
            super(null);
            Intrinsics.f(error, "error");
            this.f15475a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.a(this.f15475a, ((a) obj).f15475a);
        }

        public int hashCode() {
            return this.f15475a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f15475a + ")";
        }
    }

    public static final class b extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15476a = new b();

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 109869544;
        }

        public String toString() {
            return "Idle";
        }
    }

    public static final class c extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f15477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExoPlayer f15478b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.f(url, "url");
            Intrinsics.f(player, "player");
            this.f15477a = url;
            this.f15478b = player;
        }

        @Override // com.chartboost.sdk.impl.wd
        public ExoPlayer a() {
            return this.f15478b;
        }

        public final URL b() {
            return this.f15477a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.a(this.f15477a, cVar.f15477a) && Intrinsics.a(this.f15478b, cVar.f15478b);
        }

        public int hashCode() {
            return this.f15478b.hashCode() + (this.f15477a.hashCode() * 31);
        }

        public String toString() {
            return "Loading(url=" + this.f15477a + ", player=" + this.f15478b + ")";
        }
    }

    public static final class d extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f15479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExoPlayer f15480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.f(url, "url");
            Intrinsics.f(player, "player");
            this.f15479a = url;
            this.f15480b = player;
        }

        @Override // com.chartboost.sdk.impl.wd
        public ExoPlayer a() {
            return this.f15480b;
        }

        public final URL b() {
            return this.f15479a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.a(this.f15479a, dVar.f15479a) && Intrinsics.a(this.f15480b, dVar.f15480b);
        }

        public int hashCode() {
            return this.f15480b.hashCode() + (this.f15479a.hashCode() * 31);
        }

        public String toString() {
            return "Paused(url=" + this.f15479a + ", player=" + this.f15480b + ")";
        }
    }

    public static final class e extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f15481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExoPlayer f15482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.f(url, "url");
            Intrinsics.f(player, "player");
            this.f15481a = url;
            this.f15482b = player;
        }

        @Override // com.chartboost.sdk.impl.wd
        public ExoPlayer a() {
            return this.f15482b;
        }

        public final URL b() {
            return this.f15481a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.a(this.f15481a, eVar.f15481a) && Intrinsics.a(this.f15482b, eVar.f15482b);
        }

        public int hashCode() {
            return this.f15482b.hashCode() + (this.f15481a.hashCode() * 31);
        }

        public String toString() {
            return "Playing(url=" + this.f15481a + ", player=" + this.f15482b + ")";
        }
    }

    public static final class f extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f15483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExoPlayer f15484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.f(url, "url");
            Intrinsics.f(player, "player");
            this.f15483a = url;
            this.f15484b = player;
        }

        @Override // com.chartboost.sdk.impl.wd
        public ExoPlayer a() {
            return this.f15484b;
        }

        public final URL b() {
            return this.f15483a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.a(this.f15483a, fVar.f15483a) && Intrinsics.a(this.f15484b, fVar.f15484b);
        }

        public int hashCode() {
            return this.f15484b.hashCode() + (this.f15483a.hashCode() * 31);
        }

        public String toString() {
            return "Ready(url=" + this.f15483a + ", player=" + this.f15484b + ")";
        }
    }

    public static final class g extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f15485a = new g();

        public g() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1919674705;
        }

        public String toString() {
            return "Released";
        }
    }

    public static final class h extends wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f15486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExoPlayer f15487b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.f(url, "url");
            Intrinsics.f(player, "player");
            this.f15486a = url;
            this.f15487b = player;
        }

        @Override // com.chartboost.sdk.impl.wd
        public ExoPlayer a() {
            return this.f15487b;
        }

        public final URL b() {
            return this.f15486a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.a(this.f15486a, hVar.f15486a) && Intrinsics.a(this.f15487b, hVar.f15487b);
        }

        public int hashCode() {
            return this.f15487b.hashCode() + (this.f15486a.hashCode() * 31);
        }

        public String toString() {
            return "Stopped(url=" + this.f15486a + ", player=" + this.f15487b + ")";
        }
    }

    public wd() {
    }

    public ExoPlayer a() {
        return null;
    }

    public /* synthetic */ wd(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
