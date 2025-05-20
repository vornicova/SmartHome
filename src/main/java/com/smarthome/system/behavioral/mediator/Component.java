package com.smarthome.system.behavioral.mediator;

    public abstract class Component {
        protected Mediator mediator;

        public Component(Mediator mediator) {
            this.mediator = mediator;
        }
    }
