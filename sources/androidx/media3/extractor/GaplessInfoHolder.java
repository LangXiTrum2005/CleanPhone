package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class GaplessInfoHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f6772c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6773a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6774b = -1;

    public final boolean a(String str) {
        Matcher matcher = f6772c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i2 = Util.f5683a;
            int i3 = Integer.parseInt(strGroup, 16);
            int i4 = Integer.parseInt(matcher.group(2), 16);
            if (i3 <= 0 && i4 <= 0) {
                return false;
            }
            this.f6773a = i3;
            this.f6774b = i4;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.X;
            if (i2 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i2];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.Z) && a(commentFrame.e0)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f6938Y) && "iTunSMPB".equals(internalFrame.Z) && a(internalFrame.e0)) {
                    return;
                }
            } else {
                continue;
            }
            i2++;
        }
    }
}
