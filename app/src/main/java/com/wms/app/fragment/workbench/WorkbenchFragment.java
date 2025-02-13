/*
 * Copyright (C) 2025 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

// FILEPATH: D:/OpenSourceCodes/WMSAPP/app/src/main/java/com/wms/app/fragment/workbench/WorkbenchFragment.java

package com.wms.app.fragment.workbench;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.wms.app.core.BaseFragment;
import com.wms.app.databinding.FragmentWorkbenchBinding;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xui.widget.actionbar.TitleBar;

/**
 * 工作台页面
 *
 * @author lx
 * @since 2025-02-09
 */
@Page(anim = CoreAnim.none)
public class WorkbenchFragment extends BaseFragment<FragmentWorkbenchBinding> {

    @NonNull
    @Override
    protected FragmentWorkbenchBinding viewBindingInflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, boolean attachToRoot) {
        return FragmentWorkbenchBinding.inflate(inflater, container, attachToRoot);
    }

    /**
     * @return 返回为 null意为不需要导航栏
     */
    @Override
    protected TitleBar initTitle() {
        return null;
    }

    /**
     * 初始化控件
     */
    @Override
    protected void initViews() {
        // 在这里初始化工作台的UI组件
        // 例如：添加任务列表、项目概览、快捷操作按钮等
    }

    /**
     * 初始化监听器
     */
    @Override
    protected void initListeners() {
        // 在这里设置各种UI组件的点击监听器等
    }
}
