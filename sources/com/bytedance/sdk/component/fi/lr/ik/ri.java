package com.bytedance.sdk.component.fi.lr.ik;

import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.component.fi.tan;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri<T> {
    private tan lr;
    private ik ri;

    public ri(ik ikVar, tan tanVar) {
        this.ri = ikVar;
        this.lr = tanVar;
    }

    public void ri(sf<T> sfVar) {
        try {
            tan tanVar = this.lr;
            if (tanVar != null) {
                tanVar.ri("success", this.ri);
            }
            String strTan = this.ri.tan();
            Map<String, List<ik>> mapJbs = this.ri.slm().jbs();
            List<ik> list = mapJbs.get(strTan);
            if (list == null) {
                slm slmVarDi = this.ri.di();
                if (slmVarDi != null) {
                    slmVarDi.toString();
                    this.ri.mj();
                    slmVarDi.ri(sfVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (ik ikVar : list) {
                            slm slmVarDi2 = ikVar.di();
                            if (slmVarDi2 != null) {
                                slmVarDi2.toString();
                                ikVar.mj();
                                slmVarDi2.ri(sfVar);
                            }
                        }
                        list.clear();
                        mapJbs.remove(strTan);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            tan tanVar2 = this.lr;
            if (tanVar2 != null) {
                tanVar2.lr("success", this.ri);
            }
        } catch (Throwable unused) {
        }
    }

    public void ri(int i, String str, Throwable th) {
        try {
            tan tanVar = this.lr;
            if (tanVar != null) {
                tanVar.ri(X3.i.t, this.ri);
            }
            String strTan = this.ri.tan();
            Map<String, List<ik>> mapJbs = this.ri.slm().jbs();
            List<ik> list = mapJbs.get(strTan);
            if (list == null) {
                slm slmVarDi = this.ri.di();
                if (slmVarDi != null) {
                    slmVarDi.ri(i, str, th);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<ik> it = list.iterator();
                        while (it.hasNext()) {
                            slm slmVarDi2 = it.next().di();
                            if (slmVarDi2 != null) {
                                slmVarDi2.toString();
                                slmVarDi2.ri(i, str, th);
                            }
                        }
                        list.clear();
                        mapJbs.remove(strTan);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            tan tanVar2 = this.lr;
            if (tanVar2 != null) {
                tanVar2.lr(X3.i.t, this.ri);
            }
        } catch (Throwable unused) {
        }
    }
}
