import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { Provider } from 'react-redux';
import { store } from './Store/store';
import { BrowserRouter } from 'react-router-dom';
import { GoogleOAuthProvider } from '@react-oauth/google';

const root = ReactDOM.createRoot(document.getElementById('root'));
const clientId="1058591672216-3a91r653592vpsh2lekel252fjh784b7.apps.googleusercontent.com"
root.render(
  <React.StrictMode>
    <Provider store={store}>
      <BrowserRouter>
      <GoogleOAuthProvider clientId={clientId}> <App /> </GoogleOAuthProvider>;
       
      </BrowserRouter>
    </Provider>
  </React.StrictMode>
);

reportWebVitals();
