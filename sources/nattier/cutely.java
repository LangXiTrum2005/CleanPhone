package nattier;

import androidx.media3.common.Metadata;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.stratoscope;

/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely {
    public static void apical(int i, stratoscope stratoscopeVar, androidx.media3.common.polloi.saneness sanenessVar) {
        if (i == 1 && stratoscopeVar.attabal()) {
            sanenessVar.splinterproof(stratoscopeVar.f24785attabal).overspeculate(stratoscopeVar.f24786saneness);
        }
    }

    public static CommentFrame attabal(int i, decarock.stratoscope stratoscopeVar) {
        int iMonoploid = stratoscopeVar.monoploid();
        if (stratoscopeVar.monoploid() == 1684108385) {
            stratoscopeVar.splinterproof(8);
            String strTrm = stratoscopeVar.trm(iMonoploid - 16);
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, strTrm, strTrm);
        }
        decarock.triweekly.impromptu("MetadataUtil", "Failed to parse comment attribute: " + attabal.attabal(i));
        return null;
    }

    public static Id3Frame beachfront(int i, String str, decarock.stratoscope stratoscopeVar, boolean z, boolean z2) {
        int iMarial = marial(stratoscopeVar);
        if (z2) {
            iMarial = Math.min(1, iMarial);
        }
        if (iMarial >= 0) {
            return z ? new TextInformationFrame(str, null, ImmutableList.of(Integer.toString(iMarial))) : new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iMarial));
        }
        decarock.triweekly.impromptu("MetadataUtil", "Failed to parse uint8 attribute: " + attabal.attabal(i));
        return null;
    }

    public static Id3Frame competently(decarock.stratoscope stratoscopeVar, int i) {
        String strTrm = null;
        String strTrm2 = null;
        int i2 = -1;
        int i3 = -1;
        while (stratoscopeVar.beachfront() < i) {
            int iBeachfront = stratoscopeVar.beachfront();
            int iMonoploid = stratoscopeVar.monoploid();
            int iMonoploid2 = stratoscopeVar.monoploid();
            stratoscopeVar.splinterproof(4);
            if (iMonoploid2 == 1835360622) {
                strTrm = stratoscopeVar.trm(iMonoploid - 12);
            } else if (iMonoploid2 == 1851878757) {
                strTrm2 = stratoscopeVar.trm(iMonoploid - 12);
            } else {
                if (iMonoploid2 == 1684108385) {
                    i2 = iBeachfront;
                    i3 = iMonoploid;
                }
                stratoscopeVar.splinterproof(iMonoploid - 12);
            }
        }
        if (strTrm == null || strTrm2 == null || i2 == -1) {
            return null;
        }
        stratoscopeVar.mathsort(i2);
        stratoscopeVar.splinterproof(16);
        return new InternalFrame(strTrm, strTrm2, stratoscopeVar.trm(i3 - 16));
    }

    public static TextInformationFrame cutely(int i, String str, decarock.stratoscope stratoscopeVar) {
        int iMonoploid = stratoscopeVar.monoploid();
        if (stratoscopeVar.monoploid() == 1684108385) {
            stratoscopeVar.splinterproof(8);
            return new TextInformationFrame(str, null, ImmutableList.of(stratoscopeVar.trm(iMonoploid - 16)));
        }
        decarock.triweekly.impromptu("MetadataUtil", "Failed to parse text attribute: " + attabal.attabal(i));
        return null;
    }

    public static Metadata.Entry dern(decarock.stratoscope stratoscopeVar) {
        int iBeachfront = stratoscopeVar.beachfront() + stratoscopeVar.monoploid();
        int iMonoploid = stratoscopeVar.monoploid();
        int i = (iMonoploid >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iMonoploid;
                if (i2 == 6516084) {
                    CommentFrame commentFrameAttabal = attabal(iMonoploid, stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return commentFrameAttabal;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    TextInformationFrame textInformationFrameCutely = cutely(iMonoploid, "TIT2", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    TextInformationFrame textInformationFrameCutely2 = cutely(iMonoploid, "TCOM", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely2;
                }
                if (i2 == 6578553) {
                    TextInformationFrame textInformationFrameCutely3 = cutely(iMonoploid, "TDRC", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely3;
                }
                if (i2 == 4280916) {
                    TextInformationFrame textInformationFrameCutely4 = cutely(iMonoploid, "TPE1", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely4;
                }
                if (i2 == 7630703) {
                    TextInformationFrame textInformationFrameCutely5 = cutely(iMonoploid, "TSSE", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely5;
                }
                if (i2 == 6384738) {
                    TextInformationFrame textInformationFrameCutely6 = cutely(iMonoploid, "TALB", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely6;
                }
                if (i2 == 7108978) {
                    TextInformationFrame textInformationFrameCutely7 = cutely(iMonoploid, "USLT", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely7;
                }
                if (i2 == 6776174) {
                    TextInformationFrame textInformationFrameCutely8 = cutely(iMonoploid, "TCON", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely8;
                }
                if (i2 == 6779504) {
                    TextInformationFrame textInformationFrameCutely9 = cutely(iMonoploid, "TIT1", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely9;
                }
            } else {
                if (iMonoploid == 1735291493) {
                    TextInformationFrame textInformationFrameTaiyuan = taiyuan(stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameTaiyuan;
                }
                if (iMonoploid == 1684632427) {
                    TextInformationFrame textInformationFrameWireman = wireman(iMonoploid, "TPOS", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameWireman;
                }
                if (iMonoploid == 1953655662) {
                    TextInformationFrame textInformationFrameWireman2 = wireman(iMonoploid, "TRCK", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameWireman2;
                }
                if (iMonoploid == 1953329263) {
                    Id3Frame id3FrameBeachfront = beachfront(iMonoploid, "TBPM", stratoscopeVar, true, false);
                    stratoscopeVar.mathsort(iBeachfront);
                    return id3FrameBeachfront;
                }
                if (iMonoploid == 1668311404) {
                    Id3Frame id3FrameBeachfront2 = beachfront(iMonoploid, "TCMP", stratoscopeVar, true, true);
                    stratoscopeVar.mathsort(iBeachfront);
                    return id3FrameBeachfront2;
                }
                if (iMonoploid == 1668249202) {
                    ApicFrame apicFrameSaneness = saneness(stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return apicFrameSaneness;
                }
                if (iMonoploid == 1631670868) {
                    TextInformationFrame textInformationFrameCutely10 = cutely(iMonoploid, "TPE2", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely10;
                }
                if (iMonoploid == 1936682605) {
                    TextInformationFrame textInformationFrameCutely11 = cutely(iMonoploid, "TSOT", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely11;
                }
                if (iMonoploid == 1936679276) {
                    TextInformationFrame textInformationFrameCutely12 = cutely(iMonoploid, "TSOA", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely12;
                }
                if (iMonoploid == 1936679282) {
                    TextInformationFrame textInformationFrameCutely13 = cutely(iMonoploid, "TSOP", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely13;
                }
                if (iMonoploid == 1936679265) {
                    TextInformationFrame textInformationFrameCutely14 = cutely(iMonoploid, "TSO2", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely14;
                }
                if (iMonoploid == 1936679791) {
                    TextInformationFrame textInformationFrameCutely15 = cutely(iMonoploid, "TSOC", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely15;
                }
                if (iMonoploid == 1920233063) {
                    Id3Frame id3FrameBeachfront3 = beachfront(iMonoploid, "ITUNESADVISORY", stratoscopeVar, false, false);
                    stratoscopeVar.mathsort(iBeachfront);
                    return id3FrameBeachfront3;
                }
                if (iMonoploid == 1885823344) {
                    Id3Frame id3FrameBeachfront4 = beachfront(iMonoploid, "ITUNESGAPLESS", stratoscopeVar, false, true);
                    stratoscopeVar.mathsort(iBeachfront);
                    return id3FrameBeachfront4;
                }
                if (iMonoploid == 1936683886) {
                    TextInformationFrame textInformationFrameCutely16 = cutely(iMonoploid, "TVSHOWSORT", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely16;
                }
                if (iMonoploid == 1953919848) {
                    TextInformationFrame textInformationFrameCutely17 = cutely(iMonoploid, "TVSHOW", stratoscopeVar);
                    stratoscopeVar.mathsort(iBeachfront);
                    return textInformationFrameCutely17;
                }
                if (iMonoploid == 757935405) {
                    Id3Frame id3FrameCompetently = competently(stratoscopeVar, iBeachfront);
                    stratoscopeVar.mathsort(iBeachfront);
                    return id3FrameCompetently;
                }
            }
            decarock.triweekly.saneness("MetadataUtil", "Skipped unknown metadata entry: " + attabal.attabal(iMonoploid));
            stratoscopeVar.mathsort(iBeachfront);
            return null;
        } catch (Throwable th) {
            stratoscopeVar.mathsort(iBeachfront);
            throw th;
        }
    }

    public static void formularize(int i, Metadata metadata, androidx.media3.common.polloi.saneness sanenessVar, Metadata... metadataArr) {
        Metadata metadata2 = new Metadata(new Metadata.Entry[0]);
        if (metadata != null) {
            for (int i2 = 0; i2 < metadata.length(); i2++) {
                Metadata.Entry entryWireman = metadata.wireman(i2);
                if (entryWireman instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryWireman;
                    if (!mdtaMetadataEntry.f11338kowloon.equals("com.android.capture.fps")) {
                        metadata2 = metadata2.attabal(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata2 = metadata2.attabal(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.saneness(metadata3);
        }
        if (metadata2.length() > 0) {
            sanenessVar.lerp(metadata2);
        }
    }

    public static MdtaMetadataEntry impromptu(decarock.stratoscope stratoscopeVar, int i, String str) {
        while (true) {
            int iBeachfront = stratoscopeVar.beachfront();
            if (iBeachfront >= i) {
                return null;
            }
            int iMonoploid = stratoscopeVar.monoploid();
            if (stratoscopeVar.monoploid() == 1684108385) {
                int iMonoploid2 = stratoscopeVar.monoploid();
                int iMonoploid3 = stratoscopeVar.monoploid();
                int i2 = iMonoploid - 16;
                byte[] bArr = new byte[i2];
                stratoscopeVar.formularize(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, iMonoploid3, iMonoploid2);
            }
            stratoscopeVar.mathsort(iBeachfront + iMonoploid);
        }
    }

    public static int marial(decarock.stratoscope stratoscopeVar) {
        int iMonoploid = stratoscopeVar.monoploid();
        if (stratoscopeVar.monoploid() == 1684108385) {
            stratoscopeVar.splinterproof(8);
            int i = iMonoploid - 16;
            if (i == 1) {
                return stratoscopeVar.supplicat();
            }
            if (i == 2) {
                return stratoscopeVar.saran();
            }
            if (i == 3) {
                return stratoscopeVar.polder();
            }
            if (i == 4 && (stratoscopeVar.cutely() & 128) == 0) {
                return stratoscopeVar.seminary();
            }
        }
        decarock.triweekly.impromptu("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static ApicFrame saneness(decarock.stratoscope stratoscopeVar) {
        String str;
        int iMonoploid = stratoscopeVar.monoploid();
        if (stratoscopeVar.monoploid() != 1684108385) {
            decarock.triweekly.impromptu("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iSaneness = attabal.saneness(stratoscopeVar.monoploid());
        if (iSaneness == 13) {
            str = "image/jpeg";
        } else {
            str = iSaneness == 14 ? "image/png" : null;
        }
        if (str == null) {
            decarock.triweekly.impromptu("MetadataUtil", "Unrecognized cover art flags: " + iSaneness);
            return null;
        }
        stratoscopeVar.splinterproof(4);
        int i = iMonoploid - 16;
        byte[] bArr = new byte[i];
        stratoscopeVar.formularize(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame taiyuan(decarock.stratoscope stratoscopeVar) {
        String strAttabal = imparkation.dern.attabal(marial(stratoscopeVar) - 1);
        if (strAttabal != null) {
            return new TextInformationFrame("TCON", null, ImmutableList.of(strAttabal));
        }
        decarock.triweekly.impromptu("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static TextInformationFrame wireman(int i, String str, decarock.stratoscope stratoscopeVar) {
        int iMonoploid = stratoscopeVar.monoploid();
        if (stratoscopeVar.monoploid() == 1684108385 && iMonoploid >= 22) {
            stratoscopeVar.splinterproof(10);
            int iSaran = stratoscopeVar.saran();
            if (iSaran > 0) {
                String str2 = "" + iSaran;
                int iSaran2 = stratoscopeVar.saran();
                if (iSaran2 > 0) {
                    str2 = str2 + "/" + iSaran2;
                }
                return new TextInformationFrame(str, null, ImmutableList.of(str2));
            }
        }
        decarock.triweekly.impromptu("MetadataUtil", "Failed to parse index/count attribute: " + attabal.attabal(i));
        return null;
    }
}
