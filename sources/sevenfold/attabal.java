package sevenfold;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.util.formularize;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import speck.triweekly;

/* JADX INFO: compiled from: ByteBufferGifDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal implements maggot.marial<ByteBuffer, dern> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final C0797attabal f37537beachfront = new C0797attabal();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final saneness f37538competently = new saneness();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f37539attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness f37540dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final sevenfold.saneness f37541marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<ImageHeaderParser> f37542saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final C0797attabal f37543wireman;

    /* JADX INFO: renamed from: sevenfold.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    public static class C0797attabal {
        public terni.attabal attabal(terni.attabal.InterfaceC0809attabal interfaceC0809attabal, terni.dern dernVar, ByteBuffer byteBuffer, int i) {
            return new terni.marial(interfaceC0809attabal, dernVar, byteBuffer, i);
        }
    }

    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Queue<terni.wireman> f37544attabal = formularize.competently(0);

        public synchronized terni.wireman attabal(ByteBuffer byteBuffer) {
            terni.wireman wiremanVarPoll;
            try {
                wiremanVarPoll = this.f37544attabal.poll();
                if (wiremanVarPoll == null) {
                    wiremanVarPoll = new terni.wireman();
                }
            } catch (Throwable th) {
                throw th;
            }
            return wiremanVarPoll.arytenoidectomy(byteBuffer);
        }

        public synchronized void saneness(terni.wireman wiremanVar) {
            wiremanVar.attabal();
            this.f37544attabal.offer(wiremanVar);
        }
    }

    public attabal(Context context) {
        this(context, com.bumptech.glide.saneness.dern(context).cutely().competently(), com.bumptech.glide.saneness.dern(context).beachfront(), com.bumptech.glide.saneness.dern(context).marial());
    }

    public static int marial(terni.dern dernVar, int i, int i2) {
        int iMin = Math.min(dernVar.attabal() / i2, dernVar.wireman() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            dernVar.wireman();
            dernVar.attabal();
        }
        return iMax;
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public boolean saneness(ByteBuffer byteBuffer, maggot.wireman wiremanVar) throws IOException {
        return !((Boolean) wiremanVar.dern(taiyuan.f37588saneness)).booleanValue() && com.bumptech.glide.load.attabal.competently(this.f37542saneness, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public marial attabal(ByteBuffer byteBuffer, int i, int i2, maggot.wireman wiremanVar) {
        terni.wireman wiremanVarAttabal = this.f37540dern.attabal(byteBuffer);
        try {
            return wireman(byteBuffer, i, i2, wiremanVarAttabal, wiremanVar);
        } finally {
            this.f37540dern.saneness(wiremanVarAttabal);
        }
    }

    public final marial wireman(ByteBuffer byteBuffer, int i, int i2, terni.wireman wiremanVar, maggot.wireman wiremanVar2) {
        long jSaneness = com.bumptech.glide.util.competently.saneness();
        try {
            terni.dern dernVarDern = wiremanVar.dern();
            if (dernVarDern.saneness() > 0 && dernVarDern.dern() == 0) {
                Bitmap.Config config = wiremanVar2.dern(taiyuan.f37587attabal) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                terni.attabal attabalVarAttabal = this.f37543wireman.attabal(this.f37541marial, dernVarDern, byteBuffer, marial(dernVarDern, i, i2));
                attabalVarAttabal.wireman(config);
                attabalVarAttabal.saneness();
                Bitmap bitmapAttabal = attabalVarAttabal.attabal();
                if (bitmapAttabal == null) {
                    return null;
                }
                return new marial(new dern(this.f37539attabal, attabalVarAttabal, triweekly.dern(), i, i2, bitmapAttabal));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                com.bumptech.glide.util.competently.attabal(jSaneness);
            }
        }
    }

    public attabal(Context context, List<ImageHeaderParser> list, trawler.wireman wiremanVar, trawler.saneness sanenessVar) {
        this(context, list, wiremanVar, sanenessVar, f37538competently, f37537beachfront);
    }

    public attabal(Context context, List<ImageHeaderParser> list, trawler.wireman wiremanVar, trawler.saneness sanenessVar, saneness sanenessVar2, C0797attabal c0797attabal) {
        this.f37539attabal = context.getApplicationContext();
        this.f37542saneness = list;
        this.f37543wireman = c0797attabal;
        this.f37541marial = new sevenfold.saneness(wiremanVar, sanenessVar);
        this.f37540dern = sanenessVar2;
    }
}
