package com.badlogic.gdx.graphics.g3d;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g3d.utils.DefaultRenderableSorter;
import com.badlogic.gdx.graphics.g3d.utils.DefaultShaderProvider;
import com.badlogic.gdx.graphics.g3d.utils.DefaultTextureBinder;
import com.badlogic.gdx.graphics.g3d.utils.RenderContext;
import com.badlogic.gdx.graphics.g3d.utils.RenderableSorter;
import com.badlogic.gdx.graphics.g3d.utils.ShaderProvider;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.FlushablePool;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ModelBatch implements Disposable {
    protected Camera camera;
    protected final RenderContext context;
    private final boolean ownContext;
    protected final Array<Renderable> renderables;
    protected final RenderablePool renderablesPool;
    protected final ShaderProvider shaderProvider;
    protected final RenderableSorter sorter;

    public static class RenderablePool extends FlushablePool<Renderable> {
        @Override // com.badlogic.gdx.utils.Pool
        public Renderable newObject() {
            return new Renderable();
        }

        @Override // com.badlogic.gdx.utils.FlushablePool, com.badlogic.gdx.utils.Pool
        public Renderable obtain() {
            Renderable renderable = (Renderable) super.obtain();
            renderable.environment = null;
            renderable.material = null;
            renderable.meshPart.set("", null, 0, 0, 0);
            renderable.shader = null;
            renderable.userData = null;
            return renderable;
        }
    }

    public ModelBatch(RenderContext renderContext, ShaderProvider shaderProvider, RenderableSorter renderableSorter) {
        this.renderablesPool = new RenderablePool();
        this.renderables = new Array<>();
        this.sorter = renderableSorter == null ? new DefaultRenderableSorter() : renderableSorter;
        this.ownContext = renderContext == null;
        this.context = renderContext == null ? new RenderContext(new DefaultTextureBinder(1, 1)) : renderContext;
        this.shaderProvider = shaderProvider == null ? new DefaultShaderProvider() : shaderProvider;
    }

    public void begin(Camera camera) {
        if (this.camera != null) {
            throw new GdxRuntimeException("Call end() first.");
        }
        this.camera = camera;
        if (this.ownContext) {
            this.context.begin();
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.shaderProvider.dispose();
    }

    public void end() {
        flush();
        if (this.ownContext) {
            this.context.end();
        }
        this.camera = null;
    }

    public void flush() {
        this.sorter.sort(this.camera, this.renderables);
        Shader shader = null;
        int i = 0;
        while (true) {
            Array<Renderable> array = this.renderables;
            if (i >= array.size) {
                break;
            }
            Renderable renderable = array.get(i);
            if (shader != renderable.shader) {
                if (shader != null) {
                    shader.end();
                }
                shader = renderable.shader;
                shader.begin(this.camera, this.context);
            }
            shader.render(renderable);
            i++;
        }
        if (shader != null) {
            shader.end();
        }
        this.renderablesPool.flush();
        this.renderables.clear();
    }

    public Camera getCamera() {
        return this.camera;
    }

    public RenderContext getRenderContext() {
        return this.context;
    }

    public RenderableSorter getRenderableSorter() {
        return this.sorter;
    }

    public ShaderProvider getShaderProvider() {
        return this.shaderProvider;
    }

    public boolean ownsRenderContext() {
        return this.ownContext;
    }

    public void render(Renderable renderable) {
        renderable.shader = this.shaderProvider.getShader(renderable);
        this.renderables.add(renderable);
    }

    public void setCamera(Camera camera) {
        if (this.camera == null) {
            throw new GdxRuntimeException("Call begin() first.");
        }
        if (this.renderables.size > 0) {
            flush();
        }
        this.camera = camera;
    }

    public void render(RenderableProvider renderableProvider) {
        Array<Renderable> array = this.renderables;
        int i = array.size;
        renderableProvider.getRenderables(array, this.renderablesPool);
        while (true) {
            Array<Renderable> array2 = this.renderables;
            if (i >= array2.size) {
                return;
            }
            Renderable renderable = array2.get(i);
            renderable.shader = this.shaderProvider.getShader(renderable);
            i++;
        }
    }

    public ModelBatch(RenderContext renderContext, ShaderProvider shaderProvider) {
        this(renderContext, shaderProvider, null);
    }

    public <T extends RenderableProvider> void render(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            render(it.next());
        }
    }

    public ModelBatch(RenderContext renderContext, RenderableSorter renderableSorter) {
        this(renderContext, null, renderableSorter);
    }

    public ModelBatch(RenderContext renderContext) {
        this(renderContext, null, null);
    }

    public void render(RenderableProvider renderableProvider, Environment environment) {
        Array<Renderable> array = this.renderables;
        int i = array.size;
        renderableProvider.getRenderables(array, this.renderablesPool);
        while (true) {
            Array<Renderable> array2 = this.renderables;
            if (i >= array2.size) {
                return;
            }
            Renderable renderable = array2.get(i);
            renderable.environment = environment;
            renderable.shader = this.shaderProvider.getShader(renderable);
            i++;
        }
    }

    public ModelBatch(ShaderProvider shaderProvider, RenderableSorter renderableSorter) {
        this(null, shaderProvider, renderableSorter);
    }

    public ModelBatch(RenderableSorter renderableSorter) {
        this(null, null, renderableSorter);
    }

    public ModelBatch(ShaderProvider shaderProvider) {
        this(null, shaderProvider, null);
    }

    public ModelBatch(FileHandle fileHandle, FileHandle fileHandle2) {
        this(null, new DefaultShaderProvider(fileHandle, fileHandle2), null);
    }

    public ModelBatch(String str, String str2) {
        this(null, new DefaultShaderProvider(str, str2), null);
    }

    public ModelBatch() {
        this(null, null, null);
    }

    public <T extends RenderableProvider> void render(Iterable<T> iterable, Environment environment) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            render(it.next(), environment);
        }
    }

    public void render(RenderableProvider renderableProvider, Shader shader) {
        Array<Renderable> array = this.renderables;
        int i = array.size;
        renderableProvider.getRenderables(array, this.renderablesPool);
        while (true) {
            Array<Renderable> array2 = this.renderables;
            if (i >= array2.size) {
                return;
            }
            Renderable renderable = array2.get(i);
            renderable.shader = shader;
            renderable.shader = this.shaderProvider.getShader(renderable);
            i++;
        }
    }

    public <T extends RenderableProvider> void render(Iterable<T> iterable, Shader shader) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            render(it.next(), shader);
        }
    }

    public void render(RenderableProvider renderableProvider, Environment environment, Shader shader) {
        Array<Renderable> array = this.renderables;
        int i = array.size;
        renderableProvider.getRenderables(array, this.renderablesPool);
        while (true) {
            Array<Renderable> array2 = this.renderables;
            if (i >= array2.size) {
                return;
            }
            Renderable renderable = array2.get(i);
            renderable.environment = environment;
            renderable.shader = shader;
            renderable.shader = this.shaderProvider.getShader(renderable);
            i++;
        }
    }

    public <T extends RenderableProvider> void render(Iterable<T> iterable, Environment environment, Shader shader) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            render(it.next(), environment, shader);
        }
    }
}
