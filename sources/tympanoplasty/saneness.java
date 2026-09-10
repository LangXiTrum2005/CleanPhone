package tympanoplasty;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ImageHeaderParserRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<ImageHeaderParser> f39058attabal = new ArrayList();

    public synchronized void attabal(ImageHeaderParser imageHeaderParser) {
        this.f39058attabal.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> saneness() {
        return this.f39058attabal;
    }
}
