package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String X;

    public Id3Frame(String str) {
        this.X = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.X;
    }
}
