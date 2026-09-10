package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2607Mt implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3428a;

    public /* synthetic */ C2607Mt(int i) {
        this.f3428a = i;
    }

    public final int a(File file, File file2) {
        switch (this.f3428a) {
            case 0:
                if (file.isDirectory() && !file2.isDirectory()) {
                    return -1;
                }
                if (file.isDirectory() || !file2.isDirectory()) {
                    return file.getName().compareTo(file2.getName());
                }
                return 1;
            default:
                return file.getName().compareTo(file2.getName());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = -1;
        int i3 = 0;
        switch (this.f3428a) {
            case 0:
                return a((File) obj, (File) obj2);
            case 1:
                return a((File) obj, (File) obj2);
            case 2:
                long jLastModified = ((File) obj2).lastModified() - ((File) obj).lastModified();
                if (jLastModified == 0) {
                    return 0;
                }
                return jLastModified < 0 ? -1 : 1;
            case 3:
                String str = ((N70) obj).b.f4371a.b;
                if (str != null) {
                    switch (str) {
                        case "jichui2":
                            i = 1;
                            break;
                        case "banji2":
                            i = 0;
                            break;
                        case "dancao":
                            i = 2;
                            break;
                        case "jichui":
                            i = 1;
                            break;
                        case "banji_hong":
                        case "banji":
                            i = 0;
                            break;
                        case "jichui_hong":
                            i = 1;
                            break;
                        case "dancao2":
                        case "dancao_hong":
                            i = 2;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                } else {
                    i = 3;
                }
                Integer numValueOf = Integer.valueOf(i);
                String str2 = ((N70) obj2).b.f4371a.b;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1608154182:
                            if (!str2.equals("jichui2")) {
                                i3 = 3;
                            } else {
                                i3 = 1;
                            }
                            break;
                        case -1396346780:
                            if (!str2.equals("banji2")) {
                                i3 = 3;
                            }
                            break;
                        case -1339095392:
                            if (!str2.equals("dancao")) {
                                i3 = 3;
                            } else {
                                i3 = 2;
                            }
                            break;
                        case -1160254600:
                            if (!str2.equals("jichui")) {
                                i3 = 3;
                            } else {
                                i3 = 1;
                            }
                            break;
                        case -189156079:
                            if (!str2.equals("banji_hong")) {
                                i3 = 3;
                            }
                            break;
                        case 93503886:
                            if (!str2.equals("banji")) {
                                i3 = 3;
                            }
                            break;
                        case 1217670503:
                            if (!str2.equals("jichui_hong")) {
                                i3 = 3;
                            } else {
                                i3 = 1;
                            }
                            break;
                        case 1437715858:
                            if (!str2.equals("dancao2")) {
                                i3 = 3;
                            } else {
                                i3 = 2;
                            }
                            break;
                        case 1756875583:
                            if (!str2.equals("dancao_hong")) {
                                i3 = 3;
                            } else {
                                i3 = 2;
                            }
                            break;
                        default:
                            i3 = 3;
                            break;
                    }
                } else {
                    i3 = 3;
                }
                return AbstractC3375el.r(numValueOf, Integer.valueOf(i3));
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                AbstractC2995aW.q(str3, "a");
                AbstractC2995aW.q(str4, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                int iMin = Math.min(str3.length(), str4.length());
                int i4 = 4;
                while (true) {
                    if (i4 >= iMin) {
                        int length = str3.length();
                        int length2 = str4.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                        }
                    } else {
                        char cCharAt = str3.charAt(i4);
                        char cCharAt2 = str4.charAt(i4);
                        if (cCharAt == cCharAt2) {
                            i4++;
                        } else if (AbstractC2995aW.s(cCharAt, cCharAt2) >= 0) {
                        }
                    }
                    return i2;
                }
                i2 = 1;
                return i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2607Mt(Object obj) {
        this(1);
        this.f3428a = 1;
    }
}
