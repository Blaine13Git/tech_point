package com.windsing.tech_point.about_collection.about_set;

import java.util.TreeSet;

public class AboutSet {

    public static void main(String[] args) {
        getProjects();
//        getDaily();

    }

    /**
     * 获取不重复的项目
     */
    public static void getProjects() {
        TreeSet<String> projects = new TreeSet<>();
        String projectString = "链接费v2.0.2\n" + "单主链接费账单v1.0\n" + "链接费v2.0.1\n" + "供应商中心V1.2.4\n" + "飞流V1.4.0\n" + "链接费账单v2.0\n" + "客服系统v1.1.0\n" + "小程序企业微信消息接入\n" + "飞流V1.2.0\n" + "保证金V1.2\n" + "飞流V1.3.0\n" + "盖亚小程序飞流接入&审批流切换v1.0.0\n" + "供应商服务能力客审2.0\n" + "采购中心V4.2.0\n" + "礼品团购v1.0 \n" + "采购合同审批+飞流项目\n" + "盖亚小程序飞流接入&审批流切换v1.0.0\n" + "采购中心V4.2.2版本\n" + "供应商服务能力客审2.0\n" + "采购中心V4.2.0\n" + "供应商信息修改&审核\n" + "采购V4.2.3\n" + "采购V4.2.4\n" + "飞流V1.2.0\n" + "保证金V1.2\n" + "核价定价迁移计划\n" + "飞流V1.3.0\n" + "采购V4.3.0 \n" + "采购V4.3.2\n" + "采购V4.3.4\n" + "采购V4.3.5\n" + "供应商中心V1.2.5\n" + "采购V4.3.6\n" + "采购V4.3.7\n" + "飞流V1.5.0\n" + "花名变更申请\n" + "客服系统V1.2.0\n" + "样品管理1.9.4\n" + "样品管理1.9.5\n" + "客服系统V1.3.0\n" + "核价定价迁移计划\n" + "大资质2.6\n" + "帮助中心-知识库1.0.1\n" + "资质模块认领制需求\n" + "资质V1.2上线前验收&迭代内容\n" + "仓储管理V1.4.0\n" + "V1.9.2-仓库结构调整\n" + "样品管理V1.9.2-仓库盘点\n" + "样品管理V1.9.0.1\n" + "飓风项目\n" + "批量驳回资质";
        String[] split_projects = projectString.split("\n");

        for (int i = 0; i < split_projects.length; i++) {
            projects.add(split_projects[i].trim().toUpperCase());
        }

        projects.stream().forEach(System.out::println);
        System.out.println("Project Total：" + projects.size());
    }

    /**
     * 获取不重复的日常
     */
    public static void getDaily() {
        String dailyString = "客服系统v1.1.1\n" + "采购中心V4.3.3\n" + "辛选帮优化\n" + "保证金v1.1\n" + "小音箱误唤醒\n" + "辛喜登陆权限\n" + "辛喜小程序订单接入\n" + "辛选精灵\n" + "辛之家客服接入\n" + "2022票务系统\n" + "oms数据库迁移\n" + "样品工作台app 1.5.7\n" + "消息中心V1.7\n" + "样品管理1.9.6.1\n" + "客服系统V1.3.1\n" + "样品管理1.9.6.1\n" + "样品管理1.9.6\n" + "oms数据库迁移\n" + "仓库盘点小更新\n" + "资质历史数据处理方案补充\n" + "OMS同步ES改成批量\n" + "核价交接单锁库存逻辑优化\n" + "直播管理 V1.2.1\n" + "买家信息结构调整\n" + "OMS增加余额支付\n" + "钉钉审批流程中状态变更逻辑改动\n" + "电子签章V1.2.0\n" + "合同审批通过自动发起签约\n" + "4.0合同模版调整\n" + "飓风项目\n" + "供应商规则中心\n" + "供应商服务能力-供应商&供应链侧\n" + "平台扣点规则优化\n" + "采购临时小日常（核价&转交）\n" + "供应商日常小迭代V1.2.2\n" + "采购中心V4.2.1版本\n" + "采购中心V4.1.0 合同审批关联定价单\n" + "供应商中心V1.2.3\n" + "采购4.2.5-数据导出\n" + "采购V4.3.1\n" + "采购中心支持WORD文件预览\"\n" + "采购合同校验供应商状态\n" + "采购临时小日常&BUG修复小版本";
        TreeSet<String> dailys = new TreeSet<>();

        String[] split_daily = dailyString.split("\n");
        for (int i = 0; i < split_daily.length; i++) {
            dailys.add(split_daily[i].trim().toUpperCase());
        }

        dailys.stream().forEach(System.out::println);
        System.out.println("Daily Total：" + dailys.size());
    }
}
