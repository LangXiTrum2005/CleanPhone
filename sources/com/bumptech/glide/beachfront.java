package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import dumb.formularize;
import dumb.impassible;
import glutethimide.arytenoidectomy;
import glutethimide.cord;
import glutethimide.dovishness;
import glutethimide.graveside;
import glutethimide.preprohormone;
import glutethimide.rotuma;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import patty.adultoid;
import patty.apical;
import patty.cuirassed;
import patty.gintrap;
import patty.molybdenite;
import sevenfold.cutely;

/* JADX INFO: compiled from: RegistryFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront {

    /* JADX INFO: compiled from: RegistryFactory.java */
    public class attabal implements com.bumptech.glide.util.beachfront.saneness<Registry> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f17515attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ List f17516dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ saneness f17517saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ diandrous.attabal f17518wireman;

        public attabal(saneness sanenessVar, List list, diandrous.attabal attabalVar) {
            this.f17517saneness = sanenessVar;
            this.f17516dern = list;
            this.f17518wireman = attabalVar;
        }

        @Override // com.bumptech.glide.util.beachfront.saneness
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f17515attabal) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            ferrovanadium.attabal.attabal("Glide registry");
            this.f17515attabal = true;
            try {
                return beachfront.attabal(this.f17517saneness, this.f17516dern, this.f17518wireman);
            } finally {
                this.f17515attabal = false;
                ferrovanadium.attabal.saneness();
            }
        }
    }

    public static Registry attabal(saneness sanenessVar, List<diandrous.saneness> list, diandrous.attabal attabalVar) {
        trawler.wireman wiremanVarBeachfront = sanenessVar.beachfront();
        trawler.saneness sanenessVarMarial = sanenessVar.marial();
        Context applicationContext = sanenessVar.taiyuan().getApplicationContext();
        marial marialVarBeachfront = sanenessVar.taiyuan().beachfront();
        Registry registry = new Registry();
        saneness(applicationContext, registry, wiremanVarBeachfront, sanenessVarMarial, marialVarBeachfront);
        dern(applicationContext, sanenessVar, registry, list, attabalVar);
        return registry;
    }

    public static void dern(Context context, saneness sanenessVar, Registry registry, List<diandrous.saneness> list, diandrous.attabal attabalVar) {
        for (diandrous.saneness sanenessVar2 : list) {
            try {
                sanenessVar2.saneness(context, sanenessVar, registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + sanenessVar2.getClass().getName(), e);
            }
        }
        if (attabalVar != null) {
            attabalVar.attabal(context, sanenessVar, registry);
        }
    }

    public static void saneness(Context context, Registry registry, trawler.wireman wiremanVar, trawler.saneness sanenessVar, marial marialVar) {
        maggot.marial taiyuanVar;
        maggot.marial dernVar;
        Registry registry2;
        registry.kowloon(new DefaultImageHeaderParser());
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            registry.kowloon(new molybdenite());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listCompetently = registry.competently();
        sevenfold.attabal attabalVar = new sevenfold.attabal(context, listCompetently, wiremanVar, sanenessVar);
        maggot.marial<ParcelFileDescriptor, Bitmap> marialVarImpassible = VideoDecoder.impassible(wiremanVar);
        com.bumptech.glide.load.resource.bitmap.attabal attabalVar2 = new com.bumptech.glide.load.resource.bitmap.attabal(registry.competently(), resources.getDisplayMetrics(), wiremanVar, sanenessVar);
        if (i < 28 || !marialVar.attabal(dern.saneness.class)) {
            taiyuanVar = new patty.taiyuan(attabalVar2);
            dernVar = new com.bumptech.glide.load.resource.bitmap.dern(attabalVar2, sanenessVar);
        } else {
            dernVar = new adultoid();
            taiyuanVar = new apical();
        }
        if (i >= 28) {
            registry.marial("Animation", InputStream.class, Drawable.class, dumb.impromptu.beachfront(listCompetently, sanenessVar));
            registry.marial("Animation", ByteBuffer.class, Drawable.class, dumb.impromptu.attabal(listCompetently, sanenessVar));
        }
        formularize formularizeVar = new formularize(context);
        patty.dern dernVar2 = new patty.dern(sanenessVar);
        environ.attabal attabalVar3 = new environ.attabal();
        environ.wireman wiremanVar2 = new environ.wireman();
        ContentResolver contentResolver = context.getContentResolver();
        registry.dern(ByteBuffer.class, new glutethimide.dern()).dern(InputStream.class, new dovishness(sanenessVar)).marial("Bitmap", ByteBuffer.class, Bitmap.class, taiyuanVar).marial("Bitmap", InputStream.class, Bitmap.class, dernVar);
        if (ParcelFileDescriptorRewinder.dern()) {
            registry.marial("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new gintrap(attabalVar2));
        }
        registry.marial("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.dern(wiremanVar));
        registry.marial("Bitmap", ParcelFileDescriptor.class, Bitmap.class, marialVarImpassible).attabal(Bitmap.class, Bitmap.class, rotuma.attabal.attabal()).marial("Bitmap", Bitmap.class, Bitmap.class, new cuirassed()).wireman(Bitmap.class, dernVar2).marial("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new patty.attabal(resources, taiyuanVar)).marial("BitmapDrawable", InputStream.class, BitmapDrawable.class, new patty.attabal(resources, dernVar)).marial("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new patty.attabal(resources, marialVarImpassible)).wireman(BitmapDrawable.class, new patty.saneness(wiremanVar, dernVar2)).marial("Animation", InputStream.class, sevenfold.dern.class, new cutely(listCompetently, attabalVar, sanenessVar)).marial("Animation", ByteBuffer.class, sevenfold.dern.class, attabalVar).wireman(sevenfold.dern.class, new sevenfold.wireman()).attabal(terni.attabal.class, terni.attabal.class, rotuma.attabal.attabal()).marial("Bitmap", terni.attabal.class, Bitmap.class, new sevenfold.impromptu(wiremanVar)).saneness(Uri.class, Drawable.class, formularizeVar).saneness(Uri.class, Bitmap.class, new patty.rotuma(formularizeVar, wiremanVar)).arytenoidectomy(new labourwallah.attabal.C0714attabal()).attabal(File.class, ByteBuffer.class, new glutethimide.wireman.saneness()).attabal(File.class, InputStream.class, new glutethimide.competently.marial()).saneness(File.class, File.class, new contranatural.attabal()).attabal(File.class, ParcelFileDescriptor.class, new glutethimide.competently.saneness()).attabal(File.class, File.class, rotuma.attabal.attabal()).arytenoidectomy(new com.bumptech.glide.load.data.apical.attabal(sanenessVar));
        if (ParcelFileDescriptorRewinder.dern()) {
            registry2 = registry;
            registry2.arytenoidectomy(new ParcelFileDescriptorRewinder.attabal());
        } else {
            registry2 = registry;
        }
        arytenoidectomy<Integer, InputStream> arytenoidectomyVarCompetently = glutethimide.beachfront.competently(context);
        arytenoidectomy<Integer, AssetFileDescriptor> arytenoidectomyVarDern = glutethimide.beachfront.dern(context);
        arytenoidectomy<Integer, Drawable> arytenoidectomyVarMarial = glutethimide.beachfront.marial(context);
        Class cls = Integer.TYPE;
        registry2.attabal(cls, InputStream.class, arytenoidectomyVarCompetently).attabal(Integer.class, InputStream.class, arytenoidectomyVarCompetently).attabal(cls, AssetFileDescriptor.class, arytenoidectomyVarDern).attabal(Integer.class, AssetFileDescriptor.class, arytenoidectomyVarDern).attabal(cls, Drawable.class, arytenoidectomyVarMarial).attabal(Integer.class, Drawable.class, arytenoidectomyVarMarial).attabal(Uri.class, InputStream.class, glutethimide.adultoid.beachfront(context)).attabal(Uri.class, AssetFileDescriptor.class, glutethimide.adultoid.marial(context));
        graveside.dern dernVar3 = new graveside.dern(resources);
        graveside.attabal attabalVar4 = new graveside.attabal(resources);
        graveside.saneness sanenessVar2 = new graveside.saneness(resources);
        registry2.attabal(Integer.class, Uri.class, dernVar3).attabal(cls, Uri.class, dernVar3).attabal(Integer.class, AssetFileDescriptor.class, attabalVar4).attabal(cls, AssetFileDescriptor.class, attabalVar4).attabal(Integer.class, InputStream.class, sanenessVar2).attabal(cls, InputStream.class, sanenessVar2);
        registry2.attabal(String.class, InputStream.class, new glutethimide.marial.dern()).attabal(Uri.class, InputStream.class, new glutethimide.marial.dern()).attabal(String.class, InputStream.class, new glutethimide.gintrap.dern()).attabal(String.class, ParcelFileDescriptor.class, new glutethimide.gintrap.saneness()).attabal(String.class, AssetFileDescriptor.class, new glutethimide.gintrap.attabal()).attabal(Uri.class, InputStream.class, new glutethimide.attabal.dern(context.getAssets())).attabal(Uri.class, AssetFileDescriptor.class, new glutethimide.attabal.saneness(context.getAssets())).attabal(Uri.class, InputStream.class, new apologetic.saneness.attabal(context)).attabal(Uri.class, InputStream.class, new apologetic.dern.attabal(context));
        if (i >= 29) {
            registry2.attabal(Uri.class, InputStream.class, new apologetic.wireman.dern(context));
            registry2.attabal(Uri.class, ParcelFileDescriptor.class, new apologetic.wireman.saneness(context));
        }
        registry2.attabal(Uri.class, InputStream.class, new preprohormone.wireman(contentResolver)).attabal(Uri.class, ParcelFileDescriptor.class, new preprohormone.saneness(contentResolver)).attabal(Uri.class, AssetFileDescriptor.class, new preprohormone.attabal(contentResolver)).attabal(Uri.class, InputStream.class, new cord.attabal()).attabal(URL.class, InputStream.class, new apologetic.competently.attabal()).attabal(Uri.class, File.class, new glutethimide.formularize.attabal(context)).attabal(glutethimide.impromptu.class, InputStream.class, new apologetic.attabal.C0115attabal()).attabal(byte[].class, ByteBuffer.class, new glutethimide.saneness.attabal()).attabal(byte[].class, InputStream.class, new glutethimide.saneness.wireman()).attabal(Uri.class, Uri.class, rotuma.attabal.attabal()).attabal(Drawable.class, Drawable.class, rotuma.attabal.attabal()).saneness(Drawable.class, Drawable.class, new impassible()).monoploid(Bitmap.class, BitmapDrawable.class, new environ.saneness(resources)).monoploid(Bitmap.class, byte[].class, attabalVar3).monoploid(Drawable.class, byte[].class, new environ.dern(wiremanVar, attabalVar3, wiremanVar2)).monoploid(sevenfold.dern.class, byte[].class, wiremanVar2);
        maggot.marial<ByteBuffer, Bitmap> marialVarWireman = VideoDecoder.wireman(wiremanVar);
        registry2.saneness(ByteBuffer.class, Bitmap.class, marialVarWireman);
        registry2.saneness(ByteBuffer.class, BitmapDrawable.class, new patty.attabal(resources, marialVarWireman));
    }

    public static com.bumptech.glide.util.beachfront.saneness<Registry> wireman(saneness sanenessVar, List<diandrous.saneness> list, diandrous.attabal attabalVar) {
        return new attabal(sanenessVar, list, attabalVar);
    }
}
