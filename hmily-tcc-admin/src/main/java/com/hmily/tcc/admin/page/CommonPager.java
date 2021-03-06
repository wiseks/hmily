/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hmily.tcc.admin.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiaoyu
 */
@Data
public class CommonPager<T> implements Serializable {


    private static final long serialVersionUID = -1220101004792874251L;
    /**
     * 分页信息
     */
    private PageParameter page;


    /**
     * 返回数据
     */
    private List<T> dataList;


	public PageParameter getPage() {
		return page;
	}


	public void setPage(PageParameter page) {
		this.page = page;
	}


	public List<T> getDataList() {
		return dataList;
	}


	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

    
}
