package monroe;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: TypefaceCompatApi29Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon extends arytenoidectomy {
    public static int apical(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static FontFamily cutely(CancellationSignal cancellationSignal, hardpan.competently.saneness[] sanenessVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (hardpan.competently.saneness sanenessVar : sanenessVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(sanenessVar.wireman(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(sanenessVar.marial()).setSlant(sanenessVar.beachfront() ? 1 : 0).setTtcIndex(sanenessVar.dern()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // monroe.arytenoidectomy
    public Typeface attabal(Context context, lightstruck.marial.dern dernVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (lightstruck.marial.wireman wiremanVar : dernVar.attabal()) {
                try {
                    Font fontBuild = new Font.Builder(resources, wiremanVar.saneness()).setWeight(wiremanVar.marial()).setSlant(wiremanVar.beachfront() ? 1 : 0).setTtcIndex(wiremanVar.dern()).setFontVariationSettings(wiremanVar.wireman()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(taiyuan(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // monroe.arytenoidectomy
    public Typeface dern(Context context, CancellationSignal cancellationSignal, List<hardpan.competently.saneness[]> list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyCutely = cutely(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyCutely == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyCutely);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyCutely2 = cutely(cancellationSignal, list.get(i2), contentResolver);
                if (fontFamilyCutely2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyCutely2);
                }
            }
            return customFallbackBuilder.setStyle(taiyuan(fontFamilyCutely, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // monroe.arytenoidectomy
    public hardpan.competently.saneness impromptu(hardpan.competently.saneness[] sanenessVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // monroe.arytenoidectomy
    public Typeface marial(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // monroe.arytenoidectomy
    public Typeface saneness(Context context, CancellationSignal cancellationSignal, hardpan.competently.saneness[] sanenessVarArr, int i) {
        try {
            FontFamily fontFamilyCutely = cutely(cancellationSignal, sanenessVarArr, context.getContentResolver());
            if (fontFamilyCutely == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyCutely).setStyle(taiyuan(fontFamilyCutely, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Font taiyuan(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iApical = apical(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iApical2 = apical(fontStyle, font2.getStyle());
            if (iApical2 < iApical) {
                font = font2;
                iApical = iApical2;
            }
        }
        return font;
    }
}
