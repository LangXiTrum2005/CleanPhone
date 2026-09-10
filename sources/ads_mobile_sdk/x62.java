package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.common.base.formularize;
import java.io.File;
import java.util.HashSet;
import saneness.delouse;
import saneness.redevelopment;

/* JADX INFO: loaded from: classes.dex */
public final class x62 {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final delouse d;
    public final u13 e;

    public x62(Context context, SharedPreferences sharedPreferences, delouse delouseVar, u13 u13Var) {
        this.c = sharedPreferences;
        this.a = redevelopment.saneness(context.getDir("pccache2", 0), false);
        this.b = redevelopment.saneness(context.getDir("tmppccache2", 0), true);
        this.d = delouseVar;
        this.e = u13Var;
    }

    public final i72 a(int i) {
        String string;
        if (i == 1) {
            string = this.c.getString("LATMTD" + ((dh) this.d.get()).a, null);
        } else if (i == 2) {
            string = this.c.getString("FBAMTD" + ((dh) this.d.get()).a, null);
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            in inVar = kn.b;
            i72 i72VarA = i72.a(kn.a(bArrStringToBytes, 0, bArrStringToBytes.length));
            if (a(i72VarA.r().r())) {
                return i72VarA;
            }
            return null;
        } catch (x81 unused) {
            this.e.b(gf0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PARSE_METADATA_EXCEPTION);
        }
    }

    public final boolean a(String str) {
        File file = (File) formularize.triweekly(redevelopment.attabal(a(), str, "pcam.jar"));
        if (!file.exists()) {
            file = (File) formularize.triweekly(redevelopment.attabal(a(), str, "pcam"));
        }
        return file.exists() && ((File) formularize.triweekly(redevelopment.attabal(a(), str, "pcbc"))).exists();
    }

    public final void a(i72 i72Var, byte[] bArr, byte[] bArr2) {
        String strR = i72Var.r().r();
        if (!TextUtils.isEmpty(strR) && bArr2.length != 0) {
            redevelopment.dern(this.b);
            this.b.mkdirs();
            ((File) formularize.triweekly(TextUtils.isEmpty(strR) ? null : redevelopment.saneness(new File(this.b, strR), false))).mkdirs();
            File file = (File) formularize.triweekly(redevelopment.attabal(this.b, strR, "pcam.jar"));
            if ((bArr == null || bArr.length <= 0 || redevelopment.wireman(file, bArr)) && redevelopment.wireman((File) formularize.triweekly(redevelopment.attabal(this.b, strR, "pcbc")), bArr2)) {
                String strR2 = i72Var.r().r();
                if (!TextUtils.isEmpty(strR2)) {
                    File file2 = (File) formularize.triweekly(redevelopment.attabal(this.b, strR2, "pcam.jar"));
                    File file3 = (File) formularize.triweekly(redevelopment.attabal(this.b, strR2, "pcbc"));
                    File file4 = (File) formularize.triweekly(redevelopment.attabal(a(), strR2, "pcam.jar"));
                    File file5 = (File) formularize.triweekly(redevelopment.attabal(a(), strR2, "pcbc"));
                    if (file2.exists() && !file2.renameTo(file4)) {
                        this.e.b(gf0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_VM_RENAME_FAILED);
                    } else if (file3.exists() && file3.renameTo(file5)) {
                        i72 i72VarA = a(1);
                        SharedPreferences.Editor editorEdit = this.c.edit();
                        if (i72VarA != null && !i72Var.r().r().equals(i72VarA.r().r())) {
                            editorEdit.putString("FBAMTD" + ((dh) this.d.get()).a, Hex.bytesToStringLowercase(i72VarA.a()));
                        }
                        editorEdit.putString("LATMTD" + ((dh) this.d.get()).a, Hex.bytesToStringLowercase(i72Var.a()));
                        if (!editorEdit.commit()) {
                            this.e.b(gf0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PUSH_METADATA_FAILURE);
                        }
                    } else {
                        this.e.b(gf0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PROGRAM_BYTECODE_RENAME_FAILED);
                    }
                }
                HashSet hashSet = new HashSet();
                i72 i72VarA2 = a(1);
                if (i72VarA2 != null) {
                    hashSet.add(i72VarA2.r().r());
                }
                i72 i72VarA3 = a(2);
                if (i72VarA3 != null) {
                    hashSet.add(i72VarA3.r().r());
                }
                File[] fileArrListFiles = a().listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file6 : fileArrListFiles) {
                    String name = file6.getName();
                    if (!hashSet.contains(name)) {
                        redevelopment.dern((File) formularize.triweekly(TextUtils.isEmpty(name) ? null : redevelopment.saneness(new File(a(), name), false)));
                    }
                }
                return;
            }
        }
        this.e.b(gf0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_SAVE_TEMP_PROGRAM_FAILURE);
    }

    public final File a() {
        File file = new File(this.a, Integer.toString(((dh) this.d.get()).a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
