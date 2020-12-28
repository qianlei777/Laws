// 是否是维护管理员
function isRole(role) {
    if (role == 1) {
        return true;
    } else {
        alert("暂无权限");
        return false;
    }
}