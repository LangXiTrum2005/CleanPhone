package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaDescription;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.os.ResultReceiver;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3516gN implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4412a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4412a) {
            case 0:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 1:
                return MediaDescriptionCompat.b(MediaDescription.CREATOR.createFromParcel(parcel));
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new ResultReceiver(parcel);
            case 5:
                return new WrappedParcelable(parcel);
            case 6:
                return new DrmInitData(parcel);
            case 7:
                return new Metadata(parcel);
            case 8:
                String string = parcel.readString();
                string.getClass();
                return new AppInfoTable(parcel.readInt(), string);
            case 9:
                return new EventMessage(parcel);
            case 10:
                return new PictureFrame(parcel);
            case 11:
                return new VorbisComment(parcel);
            case 12:
                return new IcyHeaders(parcel);
            case 13:
                return new IcyInfo(parcel);
            case 14:
                return new ApicFrame(parcel);
            case 15:
                return new BinaryFrame(parcel);
            case 16:
                return new ChapterFrame(parcel);
            case 17:
                return new ChapterTocFrame(parcel);
            case 18:
                return new CommentFrame(parcel);
            case 19:
                return new GeobFrame(parcel);
            case 20:
                return new InternalFrame(parcel);
            case 21:
                return new MlltFrame(parcel);
            case 22:
                return new PrivFrame(parcel);
            case 23:
                return new UrlLinkFrame(parcel);
            case 24:
                return new SpliceNullCommand();
            case 25:
                return new com.google.android.exoplayer2.metadata.vorbis.VorbisComment(parcel);
            case 26:
                return new StreamKey(parcel);
            case 27:
                return new Requirements(parcel.readInt());
            case 28:
                return new HlsTrackMetadataEntry(parcel);
            default:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                Bundle bundleCreateBundle = null;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new RemoteMessage(bundleCreateBundle);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4412a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new ResultReceiver[i];
            case 5:
                return new WrappedParcelable[i];
            case 6:
                return new DrmInitData[i];
            case 7:
                return new Metadata[i];
            case 8:
                return new AppInfoTable[i];
            case 9:
                return new EventMessage[i];
            case 10:
                return new PictureFrame[i];
            case 11:
                return new VorbisComment[i];
            case 12:
                return new IcyHeaders[i];
            case 13:
                return new IcyInfo[i];
            case 14:
                return new ApicFrame[i];
            case 15:
                return new BinaryFrame[i];
            case 16:
                return new ChapterFrame[i];
            case 17:
                return new ChapterTocFrame[i];
            case 18:
                return new CommentFrame[i];
            case 19:
                return new GeobFrame[i];
            case 20:
                return new InternalFrame[i];
            case 21:
                return new MlltFrame[i];
            case 22:
                return new PrivFrame[i];
            case 23:
                return new UrlLinkFrame[i];
            case 24:
                return new SpliceNullCommand[i];
            case 25:
                return new com.google.android.exoplayer2.metadata.vorbis.VorbisComment[i];
            case 26:
                return new StreamKey[i];
            case 27:
                return new Requirements[i];
            case 28:
                return new HlsTrackMetadataEntry[i];
            default:
                return new RemoteMessage[i];
        }
    }
}
