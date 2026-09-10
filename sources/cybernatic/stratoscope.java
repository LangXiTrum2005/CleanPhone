package cybernatic;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class stratoscope {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Pattern f24784dern = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f24785attabal = -1;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f24786saneness = -1;

    public boolean attabal() {
        return (this.f24785attabal == -1 || this.f24786saneness == -1) ? false : true;
    }

    public boolean dern(Metadata metadata) {
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entryWireman = metadata.wireman(i);
            if (entryWireman instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryWireman;
                if ("iTunSMPB".equals(commentFrame.f13067monoploid) && saneness(commentFrame.f13068polloi)) {
                    return true;
                }
            } else if (entryWireman instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryWireman;
                if ("com.apple.iTunes".equals(internalFrame.f13074arytenoidectomy) && "iTunSMPB".equals(internalFrame.f13075monoploid) && saneness(internalFrame.f13076polloi)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean saneness(String str) {
        Matcher matcher = f24784dern.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) decarock.grimness.impromptu(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) decarock.grimness.impromptu(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f24785attabal = i;
            this.f24786saneness = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
