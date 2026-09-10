package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DvbDecoder extends SimpleSubtitleDecoder {
    public final DvbParser o;

    public DvbDecoder(List list) {
        super("DvbDecoder");
        ParsableByteArray parsableByteArray = new ParsableByteArray((byte[]) list.get(0));
        this.o = new DvbParser(parsableByteArray.z(), parsableByteArray.z());
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final Subtitle e(byte[] bArr, int i2, boolean z2) {
        boolean z3;
        DvbParser.SubtitleService subtitleService;
        List listUnmodifiableList;
        Canvas canvas;
        char c2;
        int i3;
        DvbParser.RegionComposition regionComposition;
        int iG;
        int iG2;
        int i4;
        int iG3;
        DvbParser dvbParser = this.o;
        if (z2) {
            DvbParser.SubtitleService subtitleService2 = dvbParser.f;
            subtitleService2.f18556c.clear();
            subtitleService2.d.clear();
            subtitleService2.f18557e.clear();
            subtitleService2.f.clear();
            subtitleService2.g.clear();
            subtitleService2.f18558h = null;
            subtitleService2.f18559i = null;
        }
        dvbParser.getClass();
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i2);
        while (true) {
            int iB = parsableBitArray.b();
            z3 = true;
            subtitleService = dvbParser.f;
            if (iB >= 48 && parsableBitArray.g(8) == 15) {
                int iG4 = parsableBitArray.g(8);
                int i5 = 16;
                int iG5 = parsableBitArray.g(16);
                int iG6 = parsableBitArray.g(16);
                int iD = parsableBitArray.d() + iG6;
                if (iG6 * 8 > parsableBitArray.b()) {
                    Log.g("DvbParser", "Data field length exceeds limit");
                    parsableBitArray.n(parsableBitArray.b());
                } else {
                    switch (iG4) {
                        case 16:
                            if (iG5 == subtitleService.f18554a) {
                                DvbParser.PageComposition pageComposition = subtitleService.f18559i;
                                parsableBitArray.g(8);
                                int iG7 = parsableBitArray.g(4);
                                int iG8 = parsableBitArray.g(2);
                                parsableBitArray.n(2);
                                int i6 = iG6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i6 > 0) {
                                    int iG9 = parsableBitArray.g(8);
                                    parsableBitArray.n(8);
                                    i6 -= 6;
                                    sparseArray.put(iG9, new DvbParser.PageRegion(parsableBitArray.g(16), parsableBitArray.g(16)));
                                }
                                DvbParser.PageComposition pageComposition2 = new DvbParser.PageComposition(iG7, iG8, sparseArray);
                                if (iG8 != 0) {
                                    subtitleService.f18559i = pageComposition2;
                                    subtitleService.f18556c.clear();
                                    subtitleService.d.clear();
                                    subtitleService.f18557e.clear();
                                } else if (pageComposition != null && pageComposition.f18541a != iG7) {
                                    subtitleService.f18559i = pageComposition2;
                                }
                            }
                            break;
                        case 17:
                            DvbParser.PageComposition pageComposition3 = subtitleService.f18559i;
                            if (iG5 == subtitleService.f18554a && pageComposition3 != null) {
                                int iG10 = parsableBitArray.g(8);
                                parsableBitArray.n(4);
                                boolean zF = parsableBitArray.f();
                                parsableBitArray.n(3);
                                int iG11 = parsableBitArray.g(16);
                                int iG12 = parsableBitArray.g(16);
                                parsableBitArray.g(3);
                                int iG13 = parsableBitArray.g(3);
                                parsableBitArray.n(2);
                                int iG14 = parsableBitArray.g(8);
                                int iG15 = parsableBitArray.g(8);
                                int iG16 = parsableBitArray.g(4);
                                int iG17 = parsableBitArray.g(2);
                                parsableBitArray.n(2);
                                int i7 = iG6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i7 > 0) {
                                    int iG18 = parsableBitArray.g(i5);
                                    int iG19 = parsableBitArray.g(2);
                                    parsableBitArray.g(2);
                                    int iG20 = parsableBitArray.g(12);
                                    parsableBitArray.n(4);
                                    int iG21 = parsableBitArray.g(12);
                                    int i8 = i7 - 6;
                                    if (iG19 == 1 || iG19 == 2) {
                                        parsableBitArray.g(8);
                                        parsableBitArray.g(8);
                                        i7 -= 8;
                                    } else {
                                        i7 = i8;
                                    }
                                    sparseArray2.put(iG18, new DvbParser.RegionObject(iG20, iG21));
                                    i5 = 16;
                                }
                                DvbParser.RegionComposition regionComposition2 = new DvbParser.RegionComposition(iG10, zF, iG11, iG12, iG13, iG14, iG15, iG16, iG17, sparseArray2);
                                SparseArray sparseArray3 = subtitleService.f18556c;
                                if (pageComposition3.f18542b == 0 && (regionComposition = (DvbParser.RegionComposition) sparseArray3.get(iG10)) != null) {
                                    int i9 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = regionComposition.j;
                                        if (i9 < sparseArray4.size()) {
                                            regionComposition2.j.put(sparseArray4.keyAt(i9), (DvbParser.RegionObject) sparseArray4.valueAt(i9));
                                            i9++;
                                        }
                                    }
                                }
                                sparseArray3.put(regionComposition2.f18546a, regionComposition2);
                            }
                            break;
                        case 18:
                            if (iG5 == subtitleService.f18554a) {
                                DvbParser.ClutDefinition clutDefinitionF = DvbParser.f(parsableBitArray, iG6);
                                subtitleService.d.put(clutDefinitionF.f18531a, clutDefinitionF);
                            } else if (iG5 == subtitleService.f18555b) {
                                DvbParser.ClutDefinition clutDefinitionF2 = DvbParser.f(parsableBitArray, iG6);
                                subtitleService.f.put(clutDefinitionF2.f18531a, clutDefinitionF2);
                            }
                            break;
                        case 19:
                            if (iG5 == subtitleService.f18554a) {
                                DvbParser.ObjectData objectDataG = DvbParser.g(parsableBitArray);
                                subtitleService.f18557e.put(objectDataG.f18538a, objectDataG);
                            } else if (iG5 == subtitleService.f18555b) {
                                DvbParser.ObjectData objectDataG2 = DvbParser.g(parsableBitArray);
                                subtitleService.g.put(objectDataG2.f18538a, objectDataG2);
                            }
                            break;
                        case 20:
                            if (iG5 == subtitleService.f18554a) {
                                parsableBitArray.n(4);
                                boolean zF2 = parsableBitArray.f();
                                parsableBitArray.n(3);
                                int iG22 = parsableBitArray.g(16);
                                int iG23 = parsableBitArray.g(16);
                                if (zF2) {
                                    int iG24 = parsableBitArray.g(16);
                                    iG = parsableBitArray.g(16);
                                    iG3 = parsableBitArray.g(16);
                                    iG2 = parsableBitArray.g(16);
                                    i4 = iG24;
                                } else {
                                    iG = iG22;
                                    iG2 = iG23;
                                    i4 = 0;
                                    iG3 = 0;
                                }
                                subtitleService.f18558h = new DvbParser.DisplayDefinition(iG22, iG23, i4, iG, iG3, iG2);
                            }
                            break;
                    }
                    parsableBitArray.o(iD - parsableBitArray.d());
                }
            }
        }
        DvbParser.PageComposition pageComposition4 = subtitleService.f18559i;
        if (pageComposition4 == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            DvbParser.DisplayDefinition displayDefinition = subtitleService.f18558h;
            if (displayDefinition == null) {
                displayDefinition = dvbParser.d;
            }
            Bitmap bitmap = dvbParser.g;
            Canvas canvas2 = dvbParser.f18529c;
            if (bitmap == null || displayDefinition.f18534a + 1 != bitmap.getWidth() || displayDefinition.f18535b + 1 != dvbParser.g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayDefinition.f18534a + 1, displayDefinition.f18535b + 1, Bitmap.Config.ARGB_8888);
                dvbParser.g = bitmapCreateBitmap;
                canvas2.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                SparseArray sparseArray5 = pageComposition4.f18543c;
                if (i10 < sparseArray5.size()) {
                    canvas2.save();
                    DvbParser.PageRegion pageRegion = (DvbParser.PageRegion) sparseArray5.valueAt(i10);
                    DvbParser.RegionComposition regionComposition3 = (DvbParser.RegionComposition) subtitleService.f18556c.get(sparseArray5.keyAt(i10));
                    int i11 = pageRegion.f18544a + displayDefinition.f18536c;
                    int i12 = pageRegion.f18545b + displayDefinition.f18537e;
                    boolean z4 = z3;
                    int iMin = Math.min(regionComposition3.f18548c + i11, displayDefinition.d);
                    int i13 = regionComposition3.d;
                    int i14 = i12 + i13;
                    canvas2.clipRect(i11, i12, iMin, Math.min(i14, displayDefinition.f));
                    SparseArray sparseArray6 = subtitleService.d;
                    int i15 = regionComposition3.f;
                    DvbParser.ClutDefinition clutDefinition = (DvbParser.ClutDefinition) sparseArray6.get(i15);
                    if (clutDefinition == null && (clutDefinition = (DvbParser.ClutDefinition) subtitleService.f.get(i15)) == null) {
                        clutDefinition = dvbParser.f18530e;
                    }
                    DvbParser.PageComposition pageComposition5 = pageComposition4;
                    int i16 = 0;
                    while (true) {
                        SparseArray sparseArray7 = regionComposition3.j;
                        if (i16 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i16);
                            DvbParser.RegionObject regionObject = (DvbParser.RegionObject) sparseArray7.valueAt(i16);
                            Canvas canvas3 = canvas2;
                            DvbParser.ObjectData objectData = (DvbParser.ObjectData) subtitleService.f18557e.get(iKeyAt);
                            if (objectData == null) {
                                objectData = (DvbParser.ObjectData) subtitleService.g.get(iKeyAt);
                            }
                            if (objectData != null) {
                                Paint paint = objectData.f18539b ? null : dvbParser.f18527a;
                                int i17 = i11 + regionObject.f18552a;
                                int i18 = i12 + regionObject.f18553b;
                                int i19 = regionComposition3.f18549e;
                                int[] iArr = i19 == 3 ? clutDefinition.d : i19 == 2 ? clutDefinition.f18533c : clutDefinition.f18532b;
                                DvbParser.e(objectData.f18540c, iArr, i19, i17, i18, paint, canvas3);
                                DvbParser.e(objectData.d, iArr, i19, i17, i18 + 1, paint, canvas3);
                            }
                            i16++;
                            canvas2 = canvas3;
                        } else {
                            Canvas canvas4 = canvas2;
                            boolean z5 = regionComposition3.f18547b;
                            int i20 = regionComposition3.f18548c;
                            if (z5) {
                                int i21 = regionComposition3.f18549e;
                                if (i21 == 3) {
                                    i3 = clutDefinition.d[regionComposition3.g];
                                    c2 = 2;
                                } else {
                                    c2 = 2;
                                    i3 = i21 == 2 ? clutDefinition.f18533c[regionComposition3.f18550h] : clutDefinition.f18532b[regionComposition3.f18551i];
                                }
                                Paint paint2 = dvbParser.f18528b;
                                paint2.setColor(i3);
                                canvas4.drawRect(i11, i12, i11 + i20, i14, paint2);
                                canvas = canvas4;
                            } else {
                                canvas = canvas4;
                                c2 = 2;
                            }
                            Cue.Builder builder = new Cue.Builder();
                            builder.f18455b = Bitmap.createBitmap(dvbParser.g, i11, i12, i20, i13);
                            float f = displayDefinition.f18534a;
                            builder.f18458h = i11 / f;
                            builder.f18459i = 0;
                            float f2 = i12;
                            float f3 = displayDefinition.f18535b;
                            builder.f18457e = f2 / f3;
                            builder.f = 0;
                            builder.g = 0;
                            builder.f18460l = i20 / f;
                            builder.m = i13 / f3;
                            arrayList.add(builder.a());
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i10++;
                            z3 = z4;
                            canvas2 = canvas;
                            pageComposition4 = pageComposition5;
                        }
                    }
                } else {
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
            }
        }
        return new DvbSubtitle(listUnmodifiableList);
    }
}
