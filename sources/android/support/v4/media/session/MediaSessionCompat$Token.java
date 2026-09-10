package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.GuardedBy;
import androidx.versionedparcelable.VersionedParcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BB;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new b(2);

    @GuardedBy("mLock")
    private BB mExtraBinder;
    private final Object mInner;
    private final Object mLock;

    @GuardedBy("mLock")
    private VersionedParcelable mSession2Token;

    public MediaSessionCompat$Token(Object obj, BB bb) {
        this(obj, bb, null);
    }

    public static MediaSessionCompat$Token b(Parcelable parcelable, BB bb) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof MediaSession.Token) {
            return new MediaSessionCompat$Token(parcelable, bb);
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    public final BB c() {
        BB bb;
        synchronized (this.mLock) {
            bb = this.mExtraBinder;
        }
        return bb;
    }

    public final Object d() {
        return this.mInner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(BB bb) {
        synchronized (this.mLock) {
            this.mExtraBinder = bb;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.mInner;
        if (obj2 == null) {
            return mediaSessionCompat$Token.mInner == null;
        }
        Object obj3 = mediaSessionCompat$Token.mInner;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final void f(VersionedParcelable versionedParcelable) {
        synchronized (this.mLock) {
            this.mSession2Token = versionedParcelable;
        }
    }

    public final int hashCode() {
        Object obj = this.mInner;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.mInner, i);
    }

    public MediaSessionCompat$Token(Object obj) {
        this(obj, null, null);
    }

    public MediaSessionCompat$Token(Object obj, BB bb, VersionedParcelable versionedParcelable) {
        this.mLock = new Object();
        this.mInner = obj;
        this.mExtraBinder = bb;
        this.mSession2Token = versionedParcelable;
    }
}
