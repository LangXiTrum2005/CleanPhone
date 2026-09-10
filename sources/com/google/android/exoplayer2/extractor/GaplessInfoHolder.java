package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class GaplessInfoHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f17547c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17548a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17549b = -1;

    public final boolean a(String str) {
        Matcher matcher = f17547c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i2 = Util.f18979a;
            int i3 = Integer.parseInt(strGroup, 16);
            int i4 = Integer.parseInt(matcher.group(2), 16);
            if (i3 <= 0 && i4 <= 0) {
                return false;
            }
            this.f17548a = i3;
            this.f17549b = i4;
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
                if ("com.apple.iTunes".equals(internalFrame.f18221Y) && "iTunSMPB".equals(internalFrame.Z) && a(internalFrame.e0)) {
                    return;
                }
            } else {
                continue;
            }
            i2++;
        }
    }
}
