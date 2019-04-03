package testapplication

class BootStrap {

    def init = { TestService.listOp();
    }
    def destroy = {
    }
}
