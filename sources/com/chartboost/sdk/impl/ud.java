package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import java.io.File;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ud {

    public static final class a extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f15271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f15272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l6 f15273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, URL url, l6 cache) {
            super(null);
            Intrinsics.f(context, "context");
            Intrinsics.f(url, "url");
            Intrinsics.f(cache, "cache");
            this.f15271a = context;
            this.f15272b = url;
            this.f15273c = cache;
        }

        public final l6 a() {
            return this.f15273c;
        }

        public final Context b() {
            return this.f15271a;
        }

        public final URL c() {
            return this.f15272b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.f15271a, aVar.f15271a) && Intrinsics.a(this.f15272b, aVar.f15272b) && Intrinsics.a(this.f15273c, aVar.f15273c);
        }

        public int hashCode() {
            return this.f15273c.hashCode() + ((this.f15272b.hashCode() + (this.f15271a.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Load(context=" + this.f15271a + ", url=" + this.f15272b + ", cache=" + this.f15273c + ")";
        }
    }

    public static final class b extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f15274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExoPlayer f15275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, ExoPlayer player) {
            super(null);
            Intrinsics.f(file, "file");
            Intrinsics.f(player, "player");
            this.f15274a = file;
            this.f15275b = player;
        }

        public final File a() {
            return this.f15274a;
        }

        public final ExoPlayer b() {
            return this.f15275b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.f15274a, bVar.f15274a) && Intrinsics.a(this.f15275b, bVar.f15275b);
        }

        public int hashCode() {
            return this.f15275b.hashCode() + (this.f15274a.hashCode() * 31);
        }

        public String toString() {
            return "OnAssetCached(file=" + this.f15274a + ", player=" + this.f15275b + ")";
        }
    }

    public static final class c extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15276a = new c();

        public c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2063644930;
        }

        public String toString() {
            return "OnAssetEvicted";
        }
    }

    public static final class d extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f15277a = new d();

        public d() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1259040565;
        }

        public String toString() {
            return "OnPlaybackEnded";
        }
    }

    public static final class e extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlaybackException f15278a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PlaybackException error) {
            super(null);
            Intrinsics.f(error, "error");
            this.f15278a = error;
        }

        public final PlaybackException a() {
            return this.f15278a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.a(this.f15278a, ((e) obj).f15278a);
        }

        public int hashCode() {
            return this.f15278a.hashCode();
        }

        public String toString() {
            return "OnPlayerError(error=" + this.f15278a + ")";
        }
    }

    public static final class f extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExoPlayer f15279a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ExoPlayer player) {
            super(null);
            Intrinsics.f(player, "player");
            this.f15279a = player;
        }

        public final ExoPlayer a() {
            return this.f15279a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.a(this.f15279a, ((f) obj).f15279a);
        }

        public int hashCode() {
            return this.f15279a.hashCode();
        }

        public String toString() {
            return "OnPlayerReady(player=" + this.f15279a + ")";
        }
    }

    public static final class g extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f15280a = new g();

        public g() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1967296085;
        }

        public String toString() {
            return "Pause";
        }
    }

    public static final class h extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f15281a = new h();

        public h() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 1322022111;
        }

        public String toString() {
            return "Play";
        }
    }

    public static final class i extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f15282a = new i();

        public i() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 1094867580;
        }

        public String toString() {
            return "Release";
        }
    }

    public static final class j extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f15283a;

        public j(float f) {
            super(null);
            this.f15283a = f;
        }

        public final float a() {
            return this.f15283a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Float.compare(this.f15283a, ((j) obj).f15283a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f15283a);
        }

        public String toString() {
            return "SetVolume(volume=" + this.f15283a + ")";
        }
    }

    public static final class k extends ud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fg f15284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(fg reason) {
            super(null);
            Intrinsics.f(reason, "reason");
            this.f15284a = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f15284a == ((k) obj).f15284a;
        }

        public int hashCode() {
            return this.f15284a.hashCode();
        }

        public String toString() {
            return "Stop(reason=" + this.f15284a + ")";
        }
    }

    public ud() {
    }

    public /* synthetic */ ud(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
